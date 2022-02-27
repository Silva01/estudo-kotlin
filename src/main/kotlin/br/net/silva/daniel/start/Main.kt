import br.net.silva.daniel.service.CalcularService
import java.util.*

//fun main(args: Array<String>) {
//    println("Hello World!")
//    val list : MutableList<String> = ArrayList()
//
//    list += "opa"
//    list += "Daniel"
//    list += "Teste"
//
//    val number : Int = 200
//
//    println("Numero ${number and 30}")
//
//    list.stream().forEach { d -> println("Lista $d") }
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//}

fun main(args : Array<String>) {
    val service = CalcularService()
    var e : String

    do {
        print("Qual Operação deseja executar ? (soma, divisao, multiplicacao, subtracao) ")
        val operacao = readLine()!!

        print("Digite um valor inicial para operacao: ")
        val n1 = readLine()!!.toDouble()

        print("Digite um segundo valor inicial para operacao: ")
        val n2 = readLine()!!.toDouble()

        when(operacao) {
            "soma" -> println("Resultado = ${service.somar(n1, n2)}")
            "divisao" -> println("Resultado = ${service.dividir(n1, n2)}")
            "multiplicacao" -> println("Resultado = ${service.multiplicar(n1, n2)}")
            "subtracao" -> println("Resultado = ${service.subtrair(n1, n2)}")
            else -> println("Operacao escolhida não existe ou não foi declarada")
        }

        print("Deseja Realizar uma nova Operação ? (S/N) ")
        e = readLine()!!
    } while (e.uppercase(Locale.getDefault()) != "N")
}