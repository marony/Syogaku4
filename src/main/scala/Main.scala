import scala.util.Random.nextInt

object Main {
  def main(args: Array[String]) :Unit = {
    Stream.continually((nextInt(100) + 1, nextInt(100) + 1, nextInt(100) + 1)).collectFirst {
      case (a, b, c) if (a + b + c == 25 && b - a == 8 && b - c == 3) =>
        println(s"$a * $a + $b * $b + $c * $c = ${a * a + b * b + c * c}")
    }
  }
}
