package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (r == 0 || c == 0 || r == c) {
      1
    }
    else {
      pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    val stack = List()
    check(chars, stack)

  }

  def check(chars:List[Char], stack: List[Char]): Boolean = {
    if (chars.isEmpty) {
      if (stack.isEmpty) {
        true
      }
      else {
        false
      }
    }
    // Stack is not empty
    else if (chars.head == ')') {
      if (!stack.isEmpty) {
        val poppedStack = stack.tail
        check(chars.tail, poppedStack)
      }
      else {
        false
      }
    } else if (chars.head == '(') {
      val pushedStack = '('::stack
      check(chars.tail, pushedStack)
    }
    else {
      check(chars.tail, stack)
    }

  }


  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    1
  }
}
