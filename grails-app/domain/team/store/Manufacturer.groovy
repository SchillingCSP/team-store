package team.store

class Manufacturer {

    String name

    String toString () {
        "$name"
    }

    static constraints = {
        name nullable: false, blank: false
    }
}