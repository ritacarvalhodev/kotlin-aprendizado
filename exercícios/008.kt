fun main() {
    val pessoaA = Pessoa("Maria", 20)
    val pessoaB = Pessoa("João", 10, "Rua B")

    println("Nome: ${pessoaA.nome}, Idade: ${pessoaA.idade}, Endereço: ${pessoaA.endereco}")
    println("Nome: ${pessoaB.nome}, Idade: ${pessoaB.idade}, Endereço: ${pessoaB.endereco}")
}

class Pessoa {
    var nome: String
    var idade: Int
    var endereco: String?

    constructor(nome: String, idade: Int) {
        this.nome = nome
        this.idade = idade
        this.endereco = null
    }

    constructor(nome: String, idade: Int, endereco: String) {
        this.nome = nome
        this.idade = idade
        this.endereco = endereco
    }
}

/* REFATORADO
fun main() {
    val pessoaA = Pessoa("Maria", 20)
    val pessoaB = Pessoa("João", 10, "Rua B")

    println("Nome: ${pessoaA.nome}, Idade: ${pessoaA.idade}, Endereço: ${pessoaA.endereco}")
    println("Nome: ${pessoaB.nome}, Idade: ${pessoaB.idade}, Endereço: ${pessoaB.endereco}")
}

class Pessoa(var nome: String, var idade: Int, var endereco: String?) {

    constructor(nome: String, idade: Int) : this(nome, idade, null) {
    }
} */


