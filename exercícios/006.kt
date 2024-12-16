fun main() {
    val carro1 = Carro("Fusca", 1978)
    val pessoa1 = Pessoa("Rita")

    pessoa1.dirigir(carro1)
}

class Pessoa(val nome: String) {
    fun dirigir(carro: Carro) {
        println("$nome está dirigindo o carro.")
        carro.exibirInformacoes()
    }
}

class Carro(val modelo: String, val ano: Int) {
    fun exibirInformacoes() {
        println("Modelo do carro: $modelo | Ano: $ano")
    }
}