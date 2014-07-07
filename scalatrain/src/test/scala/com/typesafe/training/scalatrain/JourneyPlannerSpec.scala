package com.typesafe.training.scalatrain

import org.scalatest.{ Matchers, WordSpec }

/**
 * Created by pol on 2014-07-07.
 */
class JourneyPlannerSpec extends WordSpec with Matchers {
  "Create a journey plan" should {
    "Get all stations from list of trains" in {

      val trainA = new Train("t1", 1, Seq((Time(0, 0), Station("Vancouver")), (Time(2, 2), Station("Edmonton"))))
      val trainB = new Train("t2", 2, Seq((Time(1, 1), Station("Winnipeg")), (Time(3, 3), Station("Toronto"))))
      val jp = new JourneyPlanner(Set(trainA, trainB))
      jp.stations shouldEqual Set(Station("Vancouver"), Station("Edmonton"), Station("Winnipeg"), Station("Toronto"))
    }
  }
}
