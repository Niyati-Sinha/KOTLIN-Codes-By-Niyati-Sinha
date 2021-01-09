fun main() {
    println("kotlin supports two types of variables")
    println("1.Mutable variables: the values of these variables can be reasigned - declared using VAR keyword")
    println("2.Local read onlu variables: the values of these variables can be assigned only once - declared using VAL keyword")
    println("VAR refers to Variable values i.e. values assigned can be changed //immutable")
    println("VAL refers to Variable values i.e. variable has a specific fixed value //mutable")
    val nameCannotBeReassigned: String = "Niyati Sinha"
    println (nameCannotBeReassigned)
    //nameCannotBeReassigned ="NIYATI SINHA" //This line will generate Error: "Kotlin: Val cannot be reassigned"
    var nameCanBeReassigned: String = "Niyati"
    println (nameCanBeReassigned)
    nameCanBeReassigned ="NIYATI SINHA"
    println (nameCanBeReassigned)
}