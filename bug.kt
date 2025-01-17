fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers.size) //this will print 2
    println(evenNumbers[2]) //this will throw IndexOutOfBoundsException
}