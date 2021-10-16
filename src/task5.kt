fun main() {
    val list  = readLine()?.split(" ")?.toList() ?:return
    val sortList = list.sorted()
    val countVal = sortList.groupingBy { it }.eachCount().toSortedMap()
    val sortCountUnique = countVal.toList().sortedByDescending { (_, value) -> value }.toMap()
    sortCountUnique.forEach(::println)
}