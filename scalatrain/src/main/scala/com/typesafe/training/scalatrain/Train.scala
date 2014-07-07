package com.typesafe.training.scalatrain

case class Station(name: String)

case class Train(kind: String, num: Int, schedule: Seq[(Time, Station)]) {
  val stations: Seq[Station] = schedule.map(s => s._2)
  require(schedule.length >= 2)

  // TODO: verify that schedule is strictly increasing in time
}

case class JourneyPlanner(trains: Set[Train]) {
  val stations: Set[Station] = trains.flatMap(t => t.stations)
}

//object MyApp extends App {
//  println(new Time(5, 5))
//}

object Time {
  def fromMinutes(minutes: Int): Time = {
    Time(minutes / 60, minutes % 60)
  }
}

case class Time(hours: Int = 0, minutes: Int = 0) {
  require(hours >= 0 && hours <= 23)
  require(minutes >= 0 && minutes <= 59)

  val asMinutes: Int = hours * 60 + minutes

  def minus(that: Time): Int = this.asMinutes - that.asMinutes

  def -(that: Time): Int = minus(that)
}
