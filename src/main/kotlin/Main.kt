import java.util.*
import kotlin.collections.HashMap

const val LIST_SIZE = 10000

fun main(args: Array<String>) {
    // Cria lista e preenche números
    val listaDeNumeros = LinkedList<Int>()
    val mapDeNumeros = HashMap<String, Int>()
    for (i in 0..LIST_SIZE) {
        listaDeNumeros.add(i)
        mapDeNumeros[i.toString()] = i
    }

    var ini: Long
    var fim: Long
    var total: Long

    // Execução 1
    ini = System.currentTimeMillis()
    total = somaValoresL(listaDeNumeros)
    fim = System.currentTimeMillis()
    println("Valor total: $total")
    println("Tempo de execução: ${fim - ini}")

    // Execução 2
    ini = fim
    total = somaValoresM(mapDeNumeros)
    fim = System.currentTimeMillis()
    println("Valor total: $total")
    println("Tempo de execução: ${fim - ini}")
}

fun somaValoresL(lista: List<Int>): Long {
    var total: Long = 0
    for (i in 0..lista.size - 1)
        total += lista[i]
    return total
}

fun somaValoresM(lista: Map<String, Int>): Long {
    var total: Long = 0
    for (i in 0..lista.size)
        total += lista[i.toString()] ?: 0
    return total
}