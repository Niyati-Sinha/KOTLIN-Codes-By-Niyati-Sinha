fun main()
{
    println("Kotlin Supports type inferences on variables and properties like Python")
    println("It means that Kotlin can recognize what kind of a value we are trying to assign to a variable")
    println("Thus, we can actually omit a type declaration of the variables (Similar to Python)")
    var FirstName : String = "Niyati" //Way1
    var LastName = "Sinha" //Way2
    println(FirstName+" "+ LastName)
    println("Although we cannot store null to the variable LastName as by default variables are non-null type in Kotlin")
    //LastName = null //Error: Kotlin: Null can not be a value of a non-null type String
}
