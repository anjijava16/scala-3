object p4 {
  def main(args: Array[String]): Unit = {
    val myList = List(1, 1, 2, 3, 5, 8)
    
    println(length(myList))
  }

  def length(input: List[Int]): Int = {
	  input.length
  }
}
