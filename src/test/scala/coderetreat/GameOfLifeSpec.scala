package coderetreat

import org.junit.runner.RunWith
import org.scalatest.{FlatSpec,Matchers}
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class GameOfLifeSpec extends FlatSpec with Matchers {
  behavior of "The game of life"

  it should "pass all the tests" in {
    val passesAllTheTests = false
    passesAllTheTests shouldBe true
  }
}
