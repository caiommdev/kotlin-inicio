fun main() {
    println("Hello World!")
    val nome: String = "Marcio"
    var grana: Double = 0.0

    println("Meu nome eh $nome")

    if (nome == "Caio"){
        grana = 1000.0
    }
    else{
        grana = -1000.0
    }

    when {
        grana > 0.0 -> println("Eu tenho R$$grana")
        grana < 0.0 -> println("Eu estou negativo")
        else -> println("Eu to ZERADO")
    }
}