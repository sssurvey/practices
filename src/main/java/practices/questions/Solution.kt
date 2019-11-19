package practices.questions

interface Solution<T, V> {

    fun getName(): String

    fun solve(solutionIn: T?): V

}