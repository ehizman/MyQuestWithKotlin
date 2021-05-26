package totalAndAverageScoreCalculator

fun main(args: Array<String>) {
    var scorecalculator = ScoreCalculator()
    scorecalculator.add()
}

class ScoreCalculator {
    private var totalScore: Int = 0
    private var numberOfScoresEntered = 0

    fun getTotal(): Int {
        return totalScore
    }

    fun add() {
        /*pseudocode
            -   set the total scores as zero
            -   set the counter of scores as zero
        *   -   prompt user to enter scores between 0 and 100 and to press -1 to exit
        *   -   while score  is not -1, check if the input is between 0 and 100
        *   -   if score is between 0 and 100:
        *                                       - add score to total
        *                                       - add score to string of elements entered
        *                                       - increment counter
        *   -   else do nothing
        *   -   prompt user to enter next score
        *   -   return to step 3
            -   when user enters -1, display the total scores
            -   calculate the average score and display it
            -   display the list and number of scores entered
        *  */
        numberOfScoresEntered = 0
        var scoresEnteredAsString: String = ""
        println("Enter class scores    Press (-1) to exit ")
        print("Enter score 1: ")
        var score = Integer.valueOf(readLine()!!)

        while (score != -1) {
            if (score in 0 until 100){
                totalScore = totalScore + score
                scoresEnteredAsString = "$scoresEnteredAsString$score "
                numberOfScoresEntered++
            }
            print("Enter score${numberOfScoresEntered + 1}: ")
            score = Integer.valueOf(readLine()!!)
        }
        println("Score entered: $scoresEnteredAsString")
        println("Number of scores entered: $numberOfScoresEntered")
        println("Total: $totalScore")
        println("Average: ${totalScore/numberOfScoresEntered}")
    }
}

