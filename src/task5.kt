fun main(args: Array<String>) {
    args.sorted().groupingBy { it }.eachCount().toSortedMap().toList().sortedByDescending { (_, value) -> value }
        .toMap().forEach(::println)
}