fun main(args:Array<String>) {
    val list  = if (args.isEmpty) readLine()?.split(" ")?.toList() ?:return else args.toList()
    val sortList = list.sorted()
    val countVal = sortList.groupingBy { it }.eachCount().toSortedMap()
    val sortCountUnique = countVal.toList().sortedByDescending { (_, value) -> value }.toMap()
    sortCountUnique.forEach(::println)
}