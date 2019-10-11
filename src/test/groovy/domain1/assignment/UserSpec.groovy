package domain1.assignment

import grails.test.mixin.gorm.Domain
import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

@Domain([User])
class UserSpec extends Specification implements DomainUnitTest<User> {

    void "validations are checked properly"() {
        given:
        User user = new User(firstName: "John", lastName: "Doe", email: "john@gmail.com", password: "2343", multipartFilePhoto: null, isAdmin: true, isActive: false).save()

        expect:
        user.firstName == "John"
    }
}
