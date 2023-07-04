package exercise3
import exercise2.Exercise2.divisors
import java.time.LocalDate
import java.time.DayOfWeek


object Exercise3 {
  def merge(list1: List[Int], list2: List[Int]): List[Int] = (list1, list2) match {
    case (Nil, _) => list2
    case (_, Nil) => list1
    case (x :: xs, y :: ys) =>
      if (x >= y)
        x :: merge(xs, list2)
      else
        y :: merge(list1, ys)
  }

  def mergeSort(list: List[Int]): List[Int] = {
    if (list.length <= 1)
      list
    else {
      val (list1, list2) = list.splitAt(list.length / 2)
      merge(mergeSort(list1), mergeSort(list2))
    }
  }

  def isFriday(date : LocalDate): Boolean = {
    date.getDayOfWeek.toString == "FRIDAY"
  }

  def isPrimeDay(date: LocalDate): Boolean = {
    val dayOfMonth = date.getDayOfMonth
    divisors(dayOfMonth).isEmpty
  }
}

