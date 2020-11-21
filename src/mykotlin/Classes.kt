package mykotlin

import java.text.FieldPosition

interface Named {
    val name: String
}

// Declares a data class for purely holding and manipulating data
data class Person (val firstName: FirstName, val lastName: LastName)

// Type inferred
class FirstName(firstName: String) {
    var value = firstName
    override fun toString(): String = value
}

// Type explicit
class LastName(lastName: String) {
    val value: String = lastName
    override fun toString(): String = value
}

class Employee(val person : Person, val position: String): Named {
    override val name = "${person.firstName.value} ${person.lastName.value}"
    override fun toString(): String = "$name works as a $position."
}

private fun main() {
    val person = Person(FirstName("Wenchy"), LastName("Dutreuil"))
    println(person)

    val engineer = Employee(person, "Software Engineer")
    println(engineer)

}


