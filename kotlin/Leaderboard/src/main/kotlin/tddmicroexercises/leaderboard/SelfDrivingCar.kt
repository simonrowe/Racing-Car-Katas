package tddmicroexercises.leaderboard

data class SelfDrivingCar(val algorithmVersion: String, val company: String) : IDriver {
  override val name: String
    get() = "$company car with algorithm $algorithmVersion"
}
