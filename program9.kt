fun main()
{
    println("One interesting difference between JAVA and Kotlin is that")
    println("data types in Kotlin are not null by default")
    println("Thus there is a distinct difference between a string and a Nullable String")
    val a: String= "" //a is blank string ->valid
    print("a is : ")
    println(a)

    //var b: String= null or val b: String= null// Error: Kotlin: Null can not be a value of a non-null type String
    //This error occurs as we have defined a String b which can store non-null strings
    //In order to define strings that can store null as well as non null we have to give a ? just after the data type String

    var c: String? = null
    println("c is: "+c)
    c = "Hi!"
    println("Now c is: "+c)
    c=null
    println("Now c is again: "+c)

    val d: String? = null
    println("d is: "+d)

    val e: String? = "We can store non-null values as well!"
    println("e is: "+e)

    var f: String? = "non-null"
    println("f is: "+f)
    f = null
    println("Now f is: "+f)
    f = "not a null string"
    println("Now f is again: "+f)

}