private val noOfStudent1 = 100;

private open class ProtectedModifier {
    protected val store = noOfStudent1

}

private class Student : ProtectedModifier() {
    protected val StoreFromProtected = noOfStudent1
    fun Ac(int: Int) {
        print("Yes")
    }
}

fun main() {
    Student().Ac(123)
}

interface FirstTime {
    fun Ac(int: Int) {
        print("Yes")
    }

    fun CoolNot(int: Int)
}

interface dj : FirstTime

private class Teacher : FirstTime {
    override fun Ac(int: Int) {
        super.Ac(int)
    }

    override fun CoolNot(int: Int) {

    }

}

/*
// Protected modifier example

// Visible just inside this file
private const val noOfStudents = 1000

// Visible just inside this file
open private class Student() {

    // Visible just inside the Student class and its subclass
    protected val newCount = noOfStudents
}

// Visible inside this file
private class StudentManager : Student() {
    // Visible inside the StudentManager class
    // newCount is visible because StudentManager is a subclass of Student
    private val finalCount = newCount
}

// ERROR: protected modifier is not allowed for top level declarations
protected const val noOfStudent = 10000

// ERROR: protected modifier is not allowed for top level declarations
protected class Staff()*/
