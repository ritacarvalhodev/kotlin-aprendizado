fun main() {
    val carro1 = Carro(23, 'B')
    val carro2 = Carro(234)
    val carro3 = Carro(false)
    val carro4 = Carro()

    println("Carro 1: número = ${carro1.num}, categoria = ${carro1.categoria}")
    println("Carro 2: número = ${carro2.num}, categoria = ${carro2.categoria}")
    println("Carro 3: número = ${carro3.num}, categoria = ${carro3.categoria}")
    println("Carro 4: número = ${carro4.num}, categoria = ${carro4.categoria}")
}

class Carro(var num: Int, var categoria: Char) {
    constructor(num: Int) : this(num, 'A')
    constructor(booleano: Boolean = true) : this(9999, if (booleano) 'A' else 'B')
    constructor() : this(0, 'A')
}