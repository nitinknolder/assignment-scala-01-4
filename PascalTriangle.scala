import org.apache.log4j.Logger

class PascalTriangle {
  val log = Logger.getLogger(this.getClass)
  def findPascal (noOfRows: Int, noOfColumns: Int): Int = {
    if (noOfColumns == noOfRows) 1
    else findPascal (noOfRows - 1, noOfColumns - 1) + findPascal (noOfColumns, noOfRows - 1)
  }

  def pascalTriangle () = {

    val limit = 5
    log.info("Pascal Triangle")
    for (rowIteration <- 0 to limit)
      for (columnIteration <- 0 to rowIteration)
         log.info(findPascal (columnIteration, rowIteration) + " ")
    log.info()
  }

  log.info("Pascal " + findPascal (0, 1))
}

object Triangle {
  def main (args: Array[String]): Unit = {

    val pascalObject = new PascalTriangle
    pascalObject.pascalTriangle ()
  }
}
