//val Username : String = "Niyati" //Error: Kotlin: Conflicting declarations: public val Username: String, public val Username: String
/* This error occurs and with-in the main folder variable Username
has been once defined as Top Level (i.e. accessible to all within the same folder) already in program7.kt
so it cannot be again defined as top level variable in any other program within the same main folder
 */
fun main()
{
    println("Read the comment it includes some important information about scope of Top level variables")
}