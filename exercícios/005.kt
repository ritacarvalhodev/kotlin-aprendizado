fun main() {
    val aluno = Aluno()
    aluno.nome = "Rita"
    aluno.matricula = 12345
    aluno.nota = 4.5

    aluno.atualizarNota(8.2)

    println("Aluno(a): ${aluno.nome}\nMatrícula: ${aluno.matricula}")

    aluno.apresentarNota()
}

class Aluno() {
    var nome: String = ""
    var matricula: Int = 0
    var nota: Double = 0.0

    fun apresentarNota() {
        println("Nota: $nota")
    }

    fun atualizarNota(novaNota: Double) {
        nota = novaNota
    }
}