//without mentioning data type nullable strings can be defined at the first level only

/*
like if I am declaring a variable without giving data type then at the very first initialization,
it is strictly necessary that it is null then only it will be treated as a nullable variable
 */

/*but here again there is a condition that if at the very first initialization it is declared without mentioning data type
as null then it can not be reassigned as if we try to reassign
it will show error that it does not know the original data type of the variable and treated it as null
 */

/*
Thus we can conclude that if we want to declare nullable variable of a particular data type
then we need to explicitly mention the data type
 */

fun main() {

    var age=21
    println(age)
    //age= null //Error: Kotlin: Null can not be a value of a non-null type Int
    //print(age)

    val name="Niyati"
    println(name)

    val noValue=null
    println(noValue)

    var any=null
    println(any)
    //any=29 //ERROR: Kotlin: The integer literal does not conform to the expected type Nothing?
    //println(any)

}