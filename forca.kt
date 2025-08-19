fun main(args: Array<String>){
    println("Inisra a massa: ") //Imprime mensagem ao usuario
    val massa : Double = readln().toDouble() //Atribui a variavel massa
    println("Insira a acelereação: ") //Imprime mensagem ao usuario
    val aceleracao : Double = readln().toDouble() //Atribui a variavel aceleracao 
    println(forca(massa, aceleracao)) //Imprime o retorno da funcao forca
 
}
fun forca(massa: Double, aceleracao: Double ): Double{ //inicia a funcao forca
    return massa * aceleracao //multiplica os valores dos argumentos passados e retorna
}
