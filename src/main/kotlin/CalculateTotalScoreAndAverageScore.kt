import java.util.*

fun main(args: Array<String>) {
    var sumOfScore: Int = 0
    var studentScore: Int
    var numberOfScore: Int = 0
    var numberInputsInString: String = " "
    val reader = Scanner(System.`in`)

    print("How many student scores do you want to enter: ")
    val numberOfStudents: Int = reader.nextInt()
    while (numberOfScore < numberOfStudents){
        print("Enter student score: ")
        studentScore = reader.nextInt()
        numberInputsInString = "$numberInputsInString$studentScore, "
        sumOfScore += studentScore
        numberOfScore += 1
    }

    println("Sum of scores: $sumOfScore")
    println("The average of $numberInputsInString is: ${sumOfScore.toDouble()/numberOfScore}" )
}