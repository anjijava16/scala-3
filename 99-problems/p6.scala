object p6 {
  def main(args: Array[String]): Unit = {
    val myList = List(1, 1, 2, 3, 5, 8)

    reverse(myList)
  }

  def isPalindrome(input: List[_]): Unit = {
    val reversed = input.reverse
    input == reversed



  }
}
