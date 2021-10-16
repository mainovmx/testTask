fun main() {
    val list  = readLine()?.split(" ")?.toList()?:return
    list.forEach(::println)
}