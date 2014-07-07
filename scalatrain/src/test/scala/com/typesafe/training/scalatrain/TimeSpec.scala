package com.typesafe.training.scalatrain

import org.scalatest._

/**
 * Created by pol on 2014-07-07.
 */
class TimeSpec extends WordSpec with Matchers {

  "Creating a Time" should {
    "throw an exception for hours not within 0 and 23" in {
      an[IllegalArgumentException] should be thrownBy new Time(hours = -1)
    }

    "throw an exception for minutes not within 0 and 59" in {
      an[IllegalArgumentException] should be thrownBy new Time(minutes = 60)
    }

    "throw an exception if min and hours do not default to 0" in {
      val t = new Time()
      t.minutes shouldEqual 0
      t.hours shouldEqual 0
    }

    "asMinutes be initialized correctly" in {
      Time(1, 40).asMinutes shouldEqual 100

    }
  }

  "Calling minus or -" should {
    "return the correct difference in minutes" in {
      Time(1, 40) minus Time(1, 10) shouldEqual 30
      Time(1, 40) - Time(1, 10) shouldEqual 30
    }
  }
}
