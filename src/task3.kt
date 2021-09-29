fun main() {
    val list  = readLine()?.split(" ")?.toList() ?:return
    val sortList = list.sorted()
    val uniqueVal = sortList.toSet()
    println("Выводим уникальные значения")
    uniqueVal.forEach{
            el -> println(el)
    }
}