package com.typesafe.training.scalatrain

import org.scalatest.{ Matchers, WordSpec }

/**
 * Created by pol on 2014-07-07.
 */
class TrainSpec extends WordSpec with Matchers {
  "Creating a train" should {
    "should have a schedule with more than two stations" in {
      an[Exception] should be thrownBy new Train("test", 1, Seq((Time(0, 0), Station("Vancouver"))))
    }

    "should have all the stations in schedule" in {
      val t = new Train("test", 1, Seq((Time(0, 0), Station("Vancouver")), (Time(0, 0), Station("Winnipeg"))))
      t.stations shouldEqual Seq(Station("Vancouver"), Station("Winnipeg"))
    }
  }

}
