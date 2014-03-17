object p1 {
  def main(args: Array[String]): Unit = {
    val myList = List(1, 1, 2, 3, 5, 8)
    
    println(last(myList))
  }

  def last(input: List[Int]): Int = {
    input(input.length - 1)
  }
}
