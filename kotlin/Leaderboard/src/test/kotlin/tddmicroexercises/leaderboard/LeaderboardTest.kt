package tddmicroexercises.leaderboard

import org.junit.Assert.assertEquals
import org.junit.Test
import tddmicroexercises.leaderboard.TestData.LEWIS_HAMILTON
import tddmicroexercises.leaderboard.TestData.NICO_ROSBERG
import tddmicroexercises.leaderboard.TestData.SEBASTIAN_VETTEL

class LeaderboardTest {

  private val race1: Race = Race("Australian Grand Prix", NICO_ROSBERG, LEWIS_HAMILTON, SEBASTIAN_VETTEL)
  private val race2: Race = Race("Malaysian Grand Prix", SEBASTIAN_VETTEL, LEWIS_HAMILTON, NICO_ROSBERG)
  private val race3: Race = Race("Chinese Grand Prix", LEWIS_HAMILTON, NICO_ROSBERG, SEBASTIAN_VETTEL)
  private val sampleLeaderboard1: Leaderboard = Leaderboard(race1, race2, race3)

  @Test
  fun itShouldSumThePoints() {
    val results = sampleLeaderboard1.driverResults()
    assertEquals(
      race1.getPoints(LEWIS_HAMILTON) + race2.getPoints(LEWIS_HAMILTON) + race3.getPoints(LEWIS_HAMILTON),
      results[LEWIS_HAMILTON.name]
    )
  }

  @Test
  fun isShouldFindTheWinner() {
    // act
    val result = sampleLeaderboard1.driverRankings()

    // verify
    assertEquals("Lewis Hamilton", result.first())
  }

  @Test
  fun itShouldKeepAllDriversWhenSamePoints() {
    // setup
    // bug, drops drivers with same points
    val winDriver1 = Race("Australian Grand Prix", NICO_ROSBERG, LEWIS_HAMILTON, SEBASTIAN_VETTEL)
    val winDriver2 = Race("Malaysian Grand Prix", LEWIS_HAMILTON, NICO_ROSBERG, SEBASTIAN_VETTEL)
    val leaderboard = Leaderboard(winDriver1, winDriver2)

    // act
    val rankings = leaderboard.driverRankings()

    // verify
    assertEquals(arrayListOf(NICO_ROSBERG.name, LEWIS_HAMILTON.name, SEBASTIAN_VETTEL.name), rankings)
    // note: the order of driver1 and driver2 is JDK/platform dependent
  }

}
