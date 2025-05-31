fun main() {
    val userA = User("Maria")
    val userB = User("Pedro")
    val userC = User("João")
    User.exibirContagem()
}

class User(var nome: String) {
    companion object {
        private var contagem = 0
        fun exibirContagem() {
            println("Total de Usuários: $contagem")
        }
    }

    init {
        println("Usuário criado: $nome")
        contagem++
    }
}