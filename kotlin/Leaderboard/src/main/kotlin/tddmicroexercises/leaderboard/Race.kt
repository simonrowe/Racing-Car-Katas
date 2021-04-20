package tddmicroexercises.leaderboard

class Race(private val name: String, vararg drivers: Driver) {
  val results: List<Driver> = listOf(*drivers)

  fun position(driver: Driver): Int {
    return this.results.indexOf(driver)
  }

  fun getPoints(driver: Driver): Int {
    return POINTS[position(driver)]
  }

  override fun toString(): String {
    return name
  }

  companion object {
    private const val FIRST = 25

    private const val SECOND = 18

    private const val THIRD = 15

    private val POINTS = arrayOf(FIRST, SECOND, THIRD)
  }
}
