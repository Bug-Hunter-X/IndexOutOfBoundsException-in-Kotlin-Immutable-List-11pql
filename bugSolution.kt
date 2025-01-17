fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers.size) //prints 2
    // Safe access using getOrNull()
    val thirdEven = evenNumbers.getOrNull(2)
    println(thirdEven) //prints null

    //or using if condition
if (evenNumbers.size > 2){
        println(evenNumbers[2])
    }
}