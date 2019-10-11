package domain1.assignment

import org.springframework.web.multipart.MultipartFile

class User {
    String firstName
    String lastName
    String email
    String password
    MultipartFile multipartFilePhoto
    Boolean isAdmin
    Boolean isActive


    List<Topic> topics
    static hasMany = [topics:Topic]


    static constraints = {
        firstName nullable: false, blank: false
        lastName nullable: false, blank: false
        email unique: true, email: true,nullable: false, blank: false
        password nullable: false, blank: false, minSize: 5
        multipartFilePhoto nullable: true
        isAdmin nullable: true
        isActive nullable: true
    }
}
