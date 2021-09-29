fun main() {
    val list  = readLine()?.split(" ")?.toList()?:return
    println("Вывод списка")
    list.forEach{
            el -> println(el)
    }
}