fun main() {
    val list  = readLine()?.split(" ")?.toList()?:return
    val sortList = list.sorted()
    val countVal = sortList.groupingBy { it }.eachCount().toSortedMap()
    println("Выводим количество повторений")
    countVal.forEach{
            el -> println(el)
    }
}