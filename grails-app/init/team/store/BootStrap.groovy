package team.store

class BootStrap {

    def init = { servletContext ->
        Category catOne = new Category(name:"One").save(failonerror:true)
        Category catTwo = new Category(name:"Two").save(failonerror:true)
        Category catThree = new Category(name:"Three").save(failonerror:true)

        Manufacturer manOne = new Manufacturer(name:"ManOne").save(failonerror:true)
        Manufacturer manTwo = new Manufacturer(name:"ManTwo").save(failonerror:true)
        Manufacturer manThree = new Manufacturer(name:"ManThree").save(failonerror:true)

        new Product(name:"ProdOne",description: "Described",category: catOne,manufacturer: manOne,price: 1.10).save(failonerror:true)
        new Product(name:"ProdTwo",description: "Described",category: catTwo,manufacturer: manTwo,price: 2.20).save(failonerror:true)
        new Product(name:"ProdThree",description: "Described",category: catThree,manufacturer: manThree,price: 3.30).save(failonerror:true)
    }
    def destroy = {
    }
}
