// use when conditional statement to assign a value to a variable
fun checkNew(update : String?)
{
    var newsToDisplay = if(update != null) update else "No updates for news"
    println(newsToDisplay)
}
fun main()
{
    var news : String? = null
    checkNew(news)

    news = "India's GDP increased by 10%"
    checkNew(news)

    news = "Successful vaccination found to immune human body against the novel coronavirus"
    checkNew(news)

    news ="null"
    checkNew(news)

    news =null
    checkNew(news)

    //now we can't call checkValue() function because KOTLIN like JAVA supposrt pass be value so only null is passed to the function and we already have 2 functions checkValue(String?) and checkValue(Int?) so it gets confused and shows an error
}