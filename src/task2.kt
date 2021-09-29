fun main() {
    val list  = readLine()?.split(" ")?.toList()?:return
    val sortList = list.sorted()
    println("Сортируем")
    sortList.forEach{
            el -> println(el)
    }
}