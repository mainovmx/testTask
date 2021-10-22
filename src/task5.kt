fun main() {
    readLine()?.split(" ")?.toList()?.sorted()?.groupingBy { it }?.
    eachCount()?.toSortedMap()?.toList()?.sortedByDescending { (_, value) -> value }?.toMap()?.forEach(::println)
}