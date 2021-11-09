fun main(args: Array<String>) {
    args.sorted().groupingBy { it }.eachCount().toSortedMap().forEach(::println)
}