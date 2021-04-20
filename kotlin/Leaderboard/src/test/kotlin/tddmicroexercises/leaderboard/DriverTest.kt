package tddmicroexercises.leaderboard

import org.junit.Test
import org.junit.Assert.assertEquals

internal class DriverTest {

  @Test
  fun nameShouldBeCorrect() {
    val driver = Driver("Name", "Country")
    assertEquals("Name" , driver.name)
  }

}
