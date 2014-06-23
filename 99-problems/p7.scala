object p7 {
  def main(args: Array[String]): Unit = {
    val result = flatten(List(List(1,1), 2, List(3, List(5, 8))))

    println(result.toString)
  }

  def flatten(input:List[_]): List[Int] = input flatMap {
    case i: List[_] => flatten(i)
    case e:Int => List(e)
  }

}
