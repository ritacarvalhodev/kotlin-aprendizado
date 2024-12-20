# Kotlin-Aprendizado
## Descrição:
Repositório com exercícios realizados por mim utilizando Kotlin, enquanto estudo para me tornar uma desenvolvedora de aplicativos para Android. Meus códigos são de "baixa qualidade", sem as famosas boas práticas, pois o meu objetivo inicialmente é apenas treinar a lógica, sem muita complexidade.

## Exercícios:
### [001](exercícios/001.kt)
Crie uma classe Pessoa com as seguintes propriedades:

- nome: String
- idade: Int
- endereco: String

E os seguintes comportamentos:

- apresentar(): imprime "Olá, eu sou [nome] e tenho [idade] anos."
- mudarEndereco(novoEndereco: String): atualiza o endereco da pessoa


### [002](exercícios/002.kt)
Crie uma classe ContaBancaria com as seguintes propriedades:

- numero: Int
- saldo: Double
- titular: String

E os seguintes comportamentos:

- depositar(valor: Double): adiciona valor ao saldo
- sacar(valor: Double): subtrai valor do saldo
- consultarSaldo(): imprime o saldo atual


### [003](exercícios/003.kt)
Crie uma classe Livro com as seguintes propriedades:

- titulo: String
- autor: String
- anoPublicacao: Int

E os seguintes comportamentos:

- resumo(): imprime um resumo do livro (titulo, autor e ano de publicação)


### [004](exercícios/004.kt)
Crie uma classe Veiculo com as seguintes propriedades:

- marca: String
- modelo: String
- ano: Int
- velocidade: Int

E os seguintes comportamentos:

- acelerar(): aumenta a velocidade em 10 km/h
- frear(): diminui a velocidade em 10 km/h
- informacoes(): imprime informações sobre o veículo (marca, modelo, ano e velocidade)


### [005](exercícios/005.kt)
Crie uma classe Aluno com as seguintes propriedades:

- nome: String
- matricula: Int
- nota: Double

E os seguintes comportamentos:

- apresentarNota(): imprime a nota do aluno
- atualizarNota(novaNota: Double): atualiza a nota do aluno


### [006](exercícios/006.kt)
Crie uma classe Pessoa com uma propriedade chamada nome do tipo String.

E o seguinte comportamento:

- dirigir(carro: Carro): método que recebe um objeto do tipo Carro como parâmetro. O método deve exibir uma mensagem
  indicando que a pessoa está dirigindo o carro e chamar o método da classe Carro para exibir as informações do veículo.

Agora, crie uma segunda classe chamada Carro com as seguintes propriedades:

- modelo: uma variável do tipo String que representa o modelo do carro.
- ano: uma variável do tipo Int que representa o ano de fabricação do carro.

E o seguinte comportamento:

- exibirInformacoes(): método que exibe o modelo e o ano de fabricação do carro.