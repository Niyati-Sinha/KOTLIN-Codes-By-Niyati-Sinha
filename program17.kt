//fun keyword is used to define a function
/*
fun functionName (FunctionParameters : FunctionParametersDataType) : FunctionReturnType
{
    body
    return valueOfFunctionReturnType
 }
 */
fun name () : String
{
    val myName = "Niyati Sinha"
    return myName
}
fun main() {
    println(name())
    println(name()) //both the time a new memory is allocated as myName variable will be declared again
}