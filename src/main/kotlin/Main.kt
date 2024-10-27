fun main() {
    calc()
}

fun mult(
    prod: Double,
    prodQtd: Int = 1
): Double {
    return prod * prodQtd
}

fun calc(){

    val lista = mapOf(
        "gel" to mult(34.79),
        "hidratante" to mult(27.46),
        "protetor solar" to mult(62.19),
        "esfoliante" to mult(26.50),
        "água micelar" to mult(35.79),
        "hidratante labial" to mult(19.99),
        "sérum" to mult(16.67),
        "algodões" to mult(15.95, 3)
    )

    var total = 0.0

    println("Lista de produtos:")

    for ((chave, valor) in lista){
        total += valor

        if (valor > 0){
            println(chave)
        }
    }

    println()

    println ("Valor total: $total")

}