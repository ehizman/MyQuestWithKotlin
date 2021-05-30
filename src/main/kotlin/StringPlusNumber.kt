fun sayHallo():Unit{
    println("Hallo!")
}

fun goodBye() {
    println("""Auf Pedersen!""")
}


fun main(){
    sayHallo()
    goodBye()

    val number = 30
    val result = if (number > 100) 4 else 42
    println(result)
    val s : String = "abc"
    for (i in 0..s.lastIndex) {
        print(s[i] + 1)
    }
    println()
    val name = "Dghr"
    for (i in 0 .. name.lastIndex){
        val ch = name[0]
        print(ch + 1)
    }
}