
class Task13 {
    fun getNewList(): Int {
        val list = List(100) { it }
        println(list.toString())
        val newList = list.filter {
            0 == it % 2
        }.subList(10, 21)
                .map {
                    it + 1
                }
        return newList.sum()
    }

    fun timeStamp(arg: () -> Unit): Long {
        val startTime = System.currentTimeMillis()
        arg()
        return System.currentTimeMillis() - startTime
    }
}
