fun main(args: Array<String>) {
    val a: List<String>? = if (args.isEmpty()) readLine()?.split(" ")?.toList()
    else args.toList()
    out(a)
}

fun out(args: List<String>?) {
    args?.toList()?.sorted()?.groupingBy { it }?.eachCount()?.toSortedMap()?.toList()
        ?.sortedByDescending { (_, value) -> value }?.toMap()?.forEach(::println)
}