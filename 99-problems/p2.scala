object p1 {
  def main(args: Array[String]): Unit = {
    val myList = List(1, 1, 2, 3, 5, 8)
    
    println(second_last(myList))
  }

  def second_last(input: List[Int]): Int = {
    input(input.length - 2)
  }
}
