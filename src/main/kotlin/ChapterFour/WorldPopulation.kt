package ChapterFour
import kotlin.math.pow

class WorldPopulation {
    private var worldPopulation : Double = 7.9
    private var percentageIncrease : Double = 1.0103
    private var previousWorldPopulation : Double = 0.0

    fun growthIncrease(years: Int) : String{
        previousWorldPopulation = worldPopulation
        worldPopulation = worldPopulation * percentageIncrease.pow(years)
        return (String.format("%.4fBillion", worldPopulation))
    }

    fun differenceInPopulation() : String{
        var difference = worldPopulation - previousWorldPopulation
        return (String.format("%.4fBillion", difference))
    }

    fun displayGrowthTable(numberOfYears : Int) : String{
        var result = String.format("%-40d%-40s%-30s", numberOfYears, growthIncrease(numberOfYears), differenceInPopulation());
        return (result);
    }

}
fun main() {
    val calculator = WorldPopulation()
    var result = String.format("%-30s%-40s%-30s", "Year", "World Population after Year", "Difference in Population " +
            "After Year");
    println(result);
    for (i in 1..75){
        println(calculator.displayGrowthTable(i))
    }
}