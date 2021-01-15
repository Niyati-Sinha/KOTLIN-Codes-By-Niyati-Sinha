import java.lang.NullPointerException

//Declaring nullable variables
//place a '?' (question mark) after the dataType name
fun main() {
    var my_pocketmoney : Int? = null
    println(my_pocketmoney)
    my_pocketmoney= 100
    println(""+my_pocketmoney+"\n")
    //println(my_pocketmoney+"\n") // Error integer + noninteger
    /*Kotlin: None of the following functions can be called with the arguments supplied:
    public final operator fun plus(other: Byte): Int defined in kotlin.Int
    public final operator fun plus(other: Double): Double defined in kotlin.Int
    public final operator fun plus(other: Float): Float defined in kotlin.Int
    public final operator fun plus(other: Int): Int defined in kotlin.Int
    public final operator fun plus(other: Long): Long defined in kotlin.Int
    public final operator fun plus(other: Short): Int defined in kotlin.Int*/

    val savings : Double? = null
    println(savings)
    println()

    var tasksRemaining: String? = "Make a recommendation System using CNN"
    println(tasksRemaining)
    tasksRemaining = null
    println(tasksRemaining+"\n")

    //var role: String? //Error variable assignment is necessary in Kotlin
    //Kotlin: Variable 'role' must be initialized
    //println(role)

}