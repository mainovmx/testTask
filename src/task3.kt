fun main() {
    val list  = readLine()?.split(" ")?.toList() ?:return
    val sortList = list.sorted()
    val uniqueVal = sortList.toSet()
    uniqueVal.forEach(::println)
}