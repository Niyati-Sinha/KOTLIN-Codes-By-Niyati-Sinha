// when() in Kotlin
fun checkValue(score : Int?)
{
    //print Congrats! Full marks if marks=100; print Opps!You scored the minimum possible value; else print the marks obtained
    when(score)
    {
        100-> println("Congrats! Full marks")
        0->println("Opps! You scored the minimum possible value")
        else->println("You scored "+ score)
    }
}

fun main()
{
    var marks: Int? = null
    checkValue(marks)

    marks=0
    checkValue(marks)

    marks=100
    checkValue(marks)

    marks=72
    checkValue(marks)
}