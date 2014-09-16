package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   *
   * |n|  = ____n!_____
   * |k|     k!(n-k)!
   */
  def pascal(c: Int, r: Int): Int = {
   factorial(r)/(factorial(c) * factorial(r-c))
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = ???

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???

  def factorial(x: Int): Int ={
    if(x == 0)
       1
    else x * factorial(x-1)
  }
}
