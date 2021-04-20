package tddmicroexercises.leaderboard

import org.junit.Assert
import org.junit.Test
import tddmicroexercises.leaderboard.TestData.LEWIS_HAMILTON
import tddmicroexercises.leaderboard.TestData.NICO_ROSBERG
import tddmicroexercises.leaderboard.TestData.SEBASTIAN_VETTEL

class RaceTest {

  private val race: Race = Race("Australian Grand Prix", NICO_ROSBERG, LEWIS_HAMILTON, SEBASTIAN_VETTEL)

  @Test
  fun isShouldCalculateDriverPoints() {
    Assert.assertEquals(25, race.getPoints(NICO_ROSBERG))
    Assert.assertEquals(18, race.getPoints(LEWIS_HAMILTON))
    Assert.assertEquals(15, race.getPoints(SEBASTIAN_VETTEL))
  }

  @Test
  fun shouldCalculatePositionOfDriver() {
    Assert.assertEquals(0, race.position(NICO_ROSBERG))
    Assert.assertEquals(1, race.position(LEWIS_HAMILTON))
    Assert.assertEquals(2, race.position(SEBASTIAN_VETTEL))
  }

}
