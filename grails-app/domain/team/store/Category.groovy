package team.store

class Category {
    String name
    static constraints = {
        name nullable: false , blank: false
    }
    String toString(){
        name
    }


}
