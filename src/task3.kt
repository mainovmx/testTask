fun main() {
    readLine()?.split(" ")?.toList()?.sorted()?.distinct()?.forEach(::println)
}