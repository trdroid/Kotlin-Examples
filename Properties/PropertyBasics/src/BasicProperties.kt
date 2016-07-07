public class Person {
    var name: String = ""
}

public class Student {
    var name: String = ""
        get() = "Mr./Ms. $field"
        set(value) {
            field = "$value."
        }
}

fun main(args: Array<String>) {
    val person = Person()
    person.name = "Keith"
    println(person.name)

    val student = Student()
    student.name = "Jai"
    println(student.name)
}