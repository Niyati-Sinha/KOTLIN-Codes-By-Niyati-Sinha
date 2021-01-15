var variable: String?= null
fun checkValue(assignValue : String?)
//fun checkValue(assignValue : String) // Error: Kotlin: Type mismatch: inferred type is String? but String was expected
{
    //print assignValue only if it stores a non-null data else print assigned value to the variable is null
    if(assignValue != null)
        println("Variable stores = "+assignValue)
    else
        println("assigned value to the variable is = "+assignValue)

}
fun main()
{
    checkValue(variable)
    variable="Something"
    checkValue(variable)
}