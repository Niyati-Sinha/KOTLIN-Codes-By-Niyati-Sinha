// use if conditional statement to assign a value to a variable
fun checkNews(update : String?)
{
    var newsToDisplay = if(update != null) update else "No updates for news"
    println(newsToDisplay)
}
fun main()
{
        var news : String? = null
        checkNews(news)

        news = "India's GDP increased by 10%"
        checkNews(news)

        news = "Successful vaccination found to immune human body against the novel coronavirus"
        checkNews(news)

        news =null
        checkNew(news)

        news ="null"
        checkNews(news)

        println()
        checkValue(news)
        println("ÏMPORTANT \ncheckValue() function can be called from this program15.kt \nhowever it was defined in program13.kt (function argument string?) as by default the functions are defined in public scope in KOTLIN")
}