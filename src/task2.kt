fun main() {
    val list  = readLine()?.split(" ")?.toList()?:return
    val sortList = list.sorted()
    sortList.forEach(::println)
}