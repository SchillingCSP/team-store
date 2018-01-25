package team.store

class Product {
    String name
    String description
    Manufacturer manufacturer
    Category category
    Double price

    static constraints = {
        name nullable:false, blank: false
        description nullable:false, blank: false
        manufacturer nullable:false
        category nullable:false
        price nullable:false
    }
}
