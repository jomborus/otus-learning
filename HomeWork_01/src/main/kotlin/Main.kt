fun main() {
    val task13 = Task13()
    println(task13.getNewList())

    val p1 = Person("st", "kk", 22)
    val p2 = Person("at", "ak", 24)
    val p3 = Person("rt", "ak", 20)
    val p4 = Person("at", "ck", 21)
    val p5 = Person("ct", "ak", 26)
    val p6 = Person("at", "bk", 22)
    val p7 = Person("bt", "kk", 19)
    val p8 = Person("bt", "ak", 19)
    val myList = mutableListOf<Person>(p1, p2, p3, p4, p5, p6, p7, p8)
    myList.sortAge()
    println(myList)
    myList.sortName()
    myList.forEach {
        println(it)
    }

    println(task13.timeStamp {
        Thread.sleep(100)
    })

}
