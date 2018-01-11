class useOfFunc {

  def operationOnList (newList: List[Int], operation: String) = {


    def Findsum (newList: List[Int]): Int = {

      newList match {
        case x :: tail => x + Findsum(tail)
        case Nil => 0
      }

      def Findprod (newList: List[Int]): Int = {

        // val newList = List (2, 4, 5, 7)
        newList match {
          case x :: tail => x * Findprod(tail)
          case Nil => 0
        }
      }

      def Findmax (newList: List[Int]): Int = {

        val newList = List (2, 4, 5, 7)
        var maxelement = newList (0)
        for (indexValue <- newList) {
          if (maxelement < indexValue) {
            maxelement = indexValue
          }
        }

      }
    }
  }

  object operation {
    def main (args: Array[String]): Int = {
      val uof = new useOfFunc
      val newList = List (2, 4, 5, 7)
      uof.operationOnList (newList,Findsum)

    }
  }

}

