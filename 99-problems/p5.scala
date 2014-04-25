object p5 {
  def main(args: Array[String]): Unit = {
    val myList = List(1, 1, 2, 3, 5, 8)

    reverse(myList)
  }

  def reverse(input: List[_]): Unit = {
    input.reverse.foreach(println)

  }
}
