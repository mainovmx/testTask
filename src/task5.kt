fun main() {
    val list  = readLine()?.split(" ")?.toList() ?:return
    val sortList = list.sorted()
    val countVal = sortList.groupingBy { it }.eachCount().toSortedMap()
    val sortCountUnique = countVal.toList().sortedByDescending { (_, value) -> value }.toMap()
    println("Количество уникальных значений")
    for (entry in sortCountUnique) {
        print(entry.key)
        print(" ")
        println(entry.value)
    }
}