package domain1.assignment

import enums.Visibility
import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TopicSpec extends Specification implements DomainUnitTest<Topic> {

    def setup() {
    }

    def cleanup() {
    }

    def "Topic should have validated fields"() {

        setup:
        User user = new User(firstName: "John", lastName: "Doe", email: "john@gmail.com", password: "2343", multipartFilePhoto: null, isAdmin: true, isActive: false).save()

        when:
        Topic topic = new Topic(name: "groovy", createdBy: user, Visibility: Visibility.PRIVATE)
        user.addToTopics(topic).save(flush:true)

        then:
        topic.validate()
        user.validate()
    }
}

