import kotlin.system.measureTimeMillis

class Task13 {
    fun getNewList(): Int {
        val list = List(100) { it + 1 }
        val newList = list.filter {
            0 == it % 2
        }.filter {
            it in 10..20
        }.map {
            it + 1
        }
        return newList.sum()
    }

    fun timeStamp(arg: () -> Unit): Long {
        return measureTimeMillis {
            arg()
        }
    }
}