package tddmicroexercises.leaderboard

import org.junit.Assert.assertEquals
import org.junit.Test

internal class SelfDrivingCarTest {

  @Test
  fun nameShouldBeCorrect() {
    val selfDrivingCar = SelfDrivingCar("1.5", "Ford")
    assertEquals("Ford car with algorithm 1.5", selfDrivingCar.name)
  }
}
