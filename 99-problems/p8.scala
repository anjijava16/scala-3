object p8 {
  def main(args: Array[String]): Unit = {
    val result = compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))

    println(result.toString)
  }

  def compress(input: List[Symbol]): List[Symbol] = {

    val it = List[Symbol]()
    val it1 = List[Symbol]()
    for (i <- input) {
      if (it.length > 0) {
        if (i != it.last)
          it1 = it union List(i)
          it = it1

      }
    }

    it
  }

}
