package team.store

class Product {
    String name
    String description
    Double price
    Category category
    Manufacturer manufacturer
    static constraints = {
        name nulable: false, blank:false
        description nullable: false, blank: false
        price nullable: false
        category nullable:false
        manufacturer nullable: false

    }
}
