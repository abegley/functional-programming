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
   //factorial(r)/(factorial(c) * factorial(r-c))
   //recursive solution
   if(c == 0 || c == r)
     1
   else
     pascal(c-1, r-1) + pascal(c, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balance(chars:List[Char],  count:Int ): Boolean = {
      if(chars.isEmpty && count == 0) true
      else if ((chars.isEmpty && count != 0) || count < 0 ) false
      else
      {
          chars.head match {
          case '('  => balance(chars.tail, count+1)
          case ')'  => balance(chars.tail, count-1)
          case _    => balance(chars.tail,count)
        }
      }
    }
    balance(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if(money == 0)
      1
    else if(money < 0)
      0
    else if(coins.isEmpty)
      0
    else {
      countChange(money, coins.tail) + countChange(money - coins.head, coins)
    }
  }

  def factorial(x: Int): Int ={
    if(x == 0)
       1
    else x * factorial(x-1)
  }
}
