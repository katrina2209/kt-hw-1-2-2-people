fun main() {
    val likes = 21
    val people = if (likes == 1 || likes % 10 == 1) "человеку" else "людям"

    println("Понравилось $likes $people")
}