fun main() {
    val conta = ContaBancaria()
    conta.numero = 12345
    conta.titular = "Rita"
    conta.saldo

    conta.depositar(100.0)
    conta.sacar(50.0)

    println("Número da conta: ${conta.numero} | Titular: ${conta.titular}")
    conta.cosultarSaldo()
}

class ContaBancaria() {
    var numero: Int = 0
    var saldo: Double = 0.0
    var titular: String = ""

    fun depositar(valor: Double) {
        saldo += valor
    }
    fun sacar(valor: Double) {
        saldo -= valor
    }
    fun cosultarSaldo() {
        println("Saldo atual: $saldo")
    }
}