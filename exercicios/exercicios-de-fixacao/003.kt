fun main() {
    val livro = Livro()
    livro.titulo = "A Espada de Herobrine"
    livro.autor = "Jim Anotsu"
    livro.anoPublicacao = 2015

    livro.resumo()
}

class Livro() {
    var titulo: String = ""
    var autor: String = ""
    var anoPublicacao: Int = 0

    fun resumo() {
        println("Título: $titulo")
        println("Autor: $autor")
        println("Ano de Publicação: $anoPublicacao")
    }
}