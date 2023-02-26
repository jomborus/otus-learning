data class Person(
        val name: String,
        val surname: String,
        val age: Int,
)

fun MutableList<Person>.sortAge() {
    this.sortByDescending {
        it.age
    }
}

fun MutableList<Person>.sortName() {
    this.sortWith(compareBy({ it.name }, { it.surname }))
}