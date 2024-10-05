// Exemplo para apresentação sobre variáveis em Kotlin

// 1. Formato de nomes e convenções de escrita

// Variáveis usando camelCase
const val firstName: String = "João"
const val lastName = "Silva" // O tipo String é inferido automaticamente

// Constantes usando UPPER_SNAKE_CASE
const val MAX_AGE: Int = 100

// 2. Palavras reservadas / palavras-chave da linguagem

// Kotlin possui várias palavras reservadas como val, var, fun, class, etc.
// Exemplo: Não podemos nomear uma variável com uma palavra reservada
// val fun = "não permitido" // Isso não compilará

// Podemos renomear uma variável para evitar conflitos sem usar palavras reservadas
const val keywordExample = "permitido se não for palavra reservada"

// 3. Vinculação de tipos: estática ou dinâmica? implícita ou explícita?

// Vinculação de tipos é estática e o tipo pode ser inferido
const val idadeImplicita = 30 // Tipo inferido: Int

// Ou explicitamente declarado
const val idadeExplicita: Int = 30

// Função com tipo explicitamente declarado no retorno
fun idadeEmString(): String {
    return idadeExplicita.toString()
}

// 4. Níveis e modificadores de escopo

// Modificadores de visibilidade em Kotlin são: public, private, protected e internal
class Pessoa(private val nome: String) {
    // nome é privado, só pode ser acessado dentro desta classe

    fun exibirNome() {
        println("Nome: $nome")
    }
}

// Classe dentro do mesmo arquivo, mas visível publicamente
class Documento(val id: Int)

// 5. Suporte a ponteiros e referências

// Kotlin não oferece suporte a ponteiros diretos. Porém, usa referências.
// Exemplo de uma referência nullable, ou seja, uma variável que pode ser nula:
var referenciaNula: String? = null

// Função main, ponto de entrada do programa
fun main() {
    // 1. Exemplos de nomes e convenções
    println("Primeiro Nome: $firstName, Último Nome: $lastName")
    println("Constante MAX_AGE: $MAX_AGE")

    // 2. Exemplo de nome evitando palavra reservada
    println("Exemplo de palavra reservada evitada: keywordExample = $keywordExample")

    // 3. Vinculação de tipos: estática e implícita
    println("Idade (implícita): $idadeImplicita")
    println("Idade (explícita): $idadeExplicita")

    // 4. Níveis e modificadores de escopo
    val pessoa = Pessoa("Alice")
    pessoa.exibirNome()

    // 5. Exemplo de uso de referências
    referenciaNula = "Referência válida agora"
    println("Valor da referência: ${referenciaNula?.uppercase()}")
}