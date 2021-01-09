//defining top level variables i.e. analogous to global variable
val name: String = "niyati"
//println(name) //ERROR: "Kotlin: Expecting a top level declaration"
// outside main only variables can be defined
fun main()
{
    println(name)
}