package printHelloWorldApp

class PrintHelloWorldApp {
    fun display(): String {
        var counter: Int = 0
        var itemToDisplay: String = ""
        while (counter < 5){
            itemToDisplay = "${itemToDisplay}Hello World\n"
            counter ++
        }
        return itemToDisplay
    }

}
