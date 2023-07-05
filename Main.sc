import exercise2.Exercise2.*
import exercise3.Exercise3.*
import java.time.LocalDate

object Main{
  def main(args: Array[String]): Unit = {
    println("divisors")
    println(divisors(30))
    println(divisors(64))
    println(divisors(127))
    println("primes")
    println(primes(7))
    println(primes(100))
    println("pythagorean")
    println(pythagorean(10))
    println(pythagorean(30))
    println("join")
    println(join(", ", List("one", "two", "three")))
    println(join("+", List("1", "2", "3")))
    println(join("X", List("abc")))
    println(join("X", List.empty[String]))
    println("mergeSort")
    println(mergeSort(List(1, 9, 3, 2, 7, 6, 4, 8, 5)))
    println(mergeSort(List(6, 2, 4, 8, 9, 5, 3, 1, 7, 10)))
    println(mergeSort(List.empty[Int]))
    println(mergeSort(List(4)))
    println("isFryday")
    println(isFriday(LocalDate.of(2018, 5, 17)))
    println(isFriday(LocalDate.of(2018, 5, 18)))
    println("isPrimeDay")
    println(isPrimeDay(LocalDate.of(2018, 5, 13)))
    println(isPrimeDay(LocalDate.of(2018, 5, 14)))
    println(isPrimeDay(LocalDate.of(2018, 6, 23)))
  }
}