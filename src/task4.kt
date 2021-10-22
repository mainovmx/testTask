fun main() {
    readLine()?.split(" ")?.toList()?.sorted()?.groupingBy { it }?.
    eachCount()?.toSortedMap()?.forEach(::println)
}