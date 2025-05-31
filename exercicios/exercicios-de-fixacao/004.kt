fun main() {
    val carro = Veiculo()
    carro.marca = "Ford"
    carro.modelo = "Mustang GT"
    carro.ano = 2023
    carro.velocidade = 130

    val moto = Veiculo()
    moto.marca = "Yamaha"
    moto.modelo = "VMAX 1700"
    moto.ano = 2021
    moto.velocidade = 130

    carro.acelerar()
    carro.informacoes()

    println("-------")

    moto.frear()
    moto.informacoes()
}

class Veiculo() {
    var marca: String = ""
    var modelo: String = ""
    var ano: Int = 0
    var velocidade: Int = 0

    fun acelerar() {
        velocidade += 10
    }

    fun frear() {
        velocidade -= 10
    }

    fun informacoes() {
        println(
            """
            Marca: $marca
            Modelo: $modelo
            Ano: $ano
            Velocidade: $velocidade Km
        """.trimIndent()
        )
    }
}