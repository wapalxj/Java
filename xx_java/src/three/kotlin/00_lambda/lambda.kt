package three.kotlin.`00_lambda`


//Lambda
fun main() {
    var method: () -> Unit={}
    println(test{

    })

    println(test(method))
}

fun test(method: () -> Unit){
    val list= listOf<String>()
    list.last()
    println("test")
}