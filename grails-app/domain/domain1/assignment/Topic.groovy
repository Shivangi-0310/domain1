package domain1.assignment

import enums.Visibility

class Topic {
    String name
    Date dateCreated
    Date lastUpdated
    Visibility visibility
    static belongsTo = [ createdBy : User]

    static constraints = {
        name blank: false, nullable: false, unique: 'createdBy'
        visibility nullable: false
    }
}
