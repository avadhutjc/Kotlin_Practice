class Person {
    var name: String = "ABCD"
    var contactNumber: String = "1234567890"
    var address: String = "XYZ"

    fun displayInfo() =
        print(
            "\n Name: $name \n" +
                    " ContactNumber: $contactNumber \n" +
                    " Address: $address"
        )

    fun performLetOperation() {
        val person = Person().let {
            return@let "The name of the Person is: ${it.name}"
        }
        print(person)
    }
}

fun main() {
    //print(Person().name)
//    Person().displayInfo()
    //   Person().performLetOperation()
    val personUnit = Person().let {
        it.name = "masai"
    }
    print(personUnit)
}