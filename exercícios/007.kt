fun main() {
    val carroA = Carro("Gol", 2015, "Branco")
    val carroB = Carro("Fusca")

    println("Modelo: ${carroA.modelo}, Ano: ${carroA.ano}, Cor: ${carroA.cor}")
    println("Modelo: ${carroB.modelo}, Ano: ${carroB.ano}, Cor: ${carroB.cor}")
}

class Carro {
    var modelo: String
    var ano: Int?
    var cor: String?

    constructor(modelo: String) {
        this.modelo = modelo
        this.ano = null
        this.cor = null
    }

    constructor(modelo: String, ano: Int, cor: String) {
        this.modelo = modelo
        this.ano = ano
        this.cor = cor
    }
}

/* REFATORADO
fun main() {
    val carroA = Carro("Gol", 2015, "Branco")
    val carroB = Carro("Fusca")

    println("Modelo: ${carroA.modelo}, Ano: ${carroA.ano}, Cor: ${carroA.cor}")
    println("Modelo: ${carroB.modelo}, Ano: ${carroB.ano}, Cor: ${carroB.cor}")
}

class Carro(val modelo: String, var ano: Int, var cor: String) {

    constructor(modelo: String) : this(modelo, 0, "Preto") {
    }
} */