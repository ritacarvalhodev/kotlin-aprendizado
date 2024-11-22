fun main() {
    val pessoaA = Pessoa()
    pessoaA.nome = "Rita"
    pessoaA.idade = 20
    pessoaA.endereco = "Rua A"

    pessoaA.apresentar()
    pessoaA.mudarEndereco("Rua B")
    println("Endereço atual: ${pessoaA.endereco}.")
}

class Pessoa {
    var nome: String = ""
    var idade: Int = 0
    var endereco: String = ""

    fun apresentar() {
        println("Olá, eu sou $nome e tenho $idade anos.")
    }
    fun mudarEndereco(novoEndereco: String) {
        endereco = novoEndereco
    }
}