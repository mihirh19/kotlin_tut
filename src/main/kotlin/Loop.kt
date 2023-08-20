fun main() {
    var count = 5
    while (count > 0) {
        println(count)
        count--
    }

    for (i in 1..5 ) {
        println(i)
    }
    for (i in 1..5 step 2) {
        println(i)
    }

    for (i in 5 downTo 1) {
        println(i)
    }
    for (i in 5 downTo 1 step 2) {
        println(i)
    }
    val n  =2
    for (i in 1..10) {
        println("$n * $i = ${n*i}")
    }
}