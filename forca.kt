fun main(args: Array<String>){
    val massa : Double = readln().toDouble() //Atribui a variavel massa o valor digitado
    println("Insira a Acelereação: ") //Imprime mensagem ao usuario
    val aceleracao : Double = readln().toDouble() //Atribui a variavel aceleracao o valor digitado
    println(forca(massa, aceleracao)) //Imprime o retorno da funcao forca
 
}
fun forca(massa: Double, aceleracaob: Double ): Double{ //inicia a funcao forca
    return massa * aceleracao //multiplica os valores dos argumentos passados e retorna
}
