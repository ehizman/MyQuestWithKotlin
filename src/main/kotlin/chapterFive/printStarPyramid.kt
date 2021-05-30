package chapterFive

fun main() {
    println("A")
    for (i in 1..10){
        for (j in 1..i){
            print("* ")
        }
        println()
    }

    println("B")
    for(i in 10 downTo 1){
        for(j in 1 .. i){
            print("* ")
        }
        println()
    }

    println("C")
    for (i in 1 .. 10){
        for (j in 2 .. i){
            print("  ")
        }
        for (j in i .. 10){
            print("* ")
        }
        println()
    }

    println("D")
    for (i in 1 until 11){
        for (j in 9 downTo i){
            print("  ")
        }
        for (j in 1 .. i){
            print("*")
        }
        println()
    }
}