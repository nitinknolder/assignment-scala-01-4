import org.apache.log4j.Logger

class useOfFunctions {

  def sumOfSquare (f: (Int, Int) => Int, num1: Int, num2: Int): Int = {

    sumOfSquare(square(num1),square(num2))
  }

  def square (squareOfnum: Int): Int = {

    squareOfnum * squareOfnum
  }

  def SumOfcube (f: (Int, Int) => Int, num1: Int, num2: Int): Int = {

    SumOfcube(cube (num1), cube (num2))
  }

  def cube (cubeOfnum: Int): Int = {

    cubeOfnum * cubeOfnum * cubeOfnum

  }

  def sum (f: (Int, Int) => Int, num1: Int, num2: Int): Int = {

    f (num1) + sum (f, num1 + 1, num2)
  }

  def sumInts (num1: Int, num2: Int): Int = {

    num1 + sumInts (num1 + 1, num2)
  }

}

object functions {

  //  val log = Logger.getLogger(this.getclass)
    def main (args: Array[String]): Int = {

      val fop = new useOfFunctions
      //def commonNum(sumNum: Int): Int = sumNum
      def sumInts(num1: Int, num2: Int) = fop.sum(sumInts,5,4)
      def square(num1: Int, num2: Int) = fop.sumOfSquare(square,5,4)
      def cube(num1: Int, num2: Int) = fop.SumOfcube(cube,5,4)
    }
  }

