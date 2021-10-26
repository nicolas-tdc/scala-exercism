/** Space age exercise. Heavily inspired by steffenalbrecht */

import scala.language.dynamics

object SpaceAge extends Dynamic {

  val Periods = Map(
      "Earth"     -> 1.0,
      "Mercury"   -> 0.2408467,
      "Venus"     -> 0.61519726,
      "Mars"      -> 1.8808158,
      "Jupiter"   -> 11.862615,
      "Saturn"    -> 29.447498,
      "Uranus"    -> 84.016846,
      "Neptune"   -> 164.79132,
  )

  val EartYearInSeconds = 31557600

  def applyDynamic(methodName: String)(age: Double) : Double = {
    val planetName = methodName.substring(2)
    val period = Periods(planetName)
    age / (EartYearInSeconds * period)
  }
}