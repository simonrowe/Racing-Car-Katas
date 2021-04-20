package tddmicroexercises.leaderboard

class Leaderboard(vararg races: Race) {

  private val driverResults: Map<String, Int> = listOf(*races)
    .map { race -> race.results.map { driver -> driver.name to race.getPoints(driver) } }
    .flatten()
    .groupBy({ it.first }, { it.second })
    .mapValues { it.value.sum() }

  fun driverResults() = driverResults

  fun driverRankings(): List<String> = driverResults.keys.sortedByDescending { driverResults[it]!! }

}
