package digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Atila"
    var idade: Int = 25
    var cpf: String = "123.456.789-10"
}

fun main(){
    val atila = Pessoa()

    println(atila.nome)
    println(atila.idade)
    println(atila.cpf)
}