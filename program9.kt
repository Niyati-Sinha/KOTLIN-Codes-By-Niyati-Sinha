fun main()
{
    println("One interesting difference between JAVA and Kotlin is that")
    println("data types in Kotlin are not null by default")
    println("Thus there is a distinct difference between a string and a Nullable String")
    val a: String= "" //a is blank string ->valid
    print("a is : ")
    println(a)

    //val b: String= null // Error: Kotlin: Null can not be a value of a non-null type String
    //This error occurs as we have defined a String b which can store non-null strings
    //In order to define strings that can store null we have to give a ? just after the data type String

    val c: String? = null
    println(c)
}