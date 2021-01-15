//fun keyword is used to define a function
/*
fun functionName (FunctionParameters : FunctionParametersDataType) : FunctionReturnType
{
    body
    return valueOfFunctionReturnType
 }
 */
fun name (myName : String ) : String
{
    return myName
}
fun main() {
    println(name("Niyati Sinha"))
    println(name("Saumya")) //both the time a new memory is allocated as myName variable will be declared again
}