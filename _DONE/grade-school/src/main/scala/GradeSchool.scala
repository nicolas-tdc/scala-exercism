/** For Scala 2.13.6 */

import scala.collection.immutable.SortedMap

class School {
  var db = SortedMap[Int, Seq[String]]().withDefaultValue(Seq())

  def grade = db

  def add(name: String, g: Int) = {
    db += g -> (db(g) :+ name)
  }

  def sorted = db.view.mapValues(_.sorted).toMap
}