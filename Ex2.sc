package exercise2


object Exercise2:
  def divisors(n : Int): List[Int] = {
    val ds = for i <- 2 until n if n % i == 0
    yield i
    ds.toList
  }

  def primes(n : Int): List[Int] = {
    val ps = for i <- 2 until n + 1 if divisors(i).isEmpty
    yield i
    ps.toList
  }

  def join(sep: String, list: List[String]): String = {
    list.mkString(sep)
  }

  def pythagorean(n: Int) : List[(Int, Int, Int)] = {
    val triples = for x <- 1 until n + 1
        y <- 1 until n + 1
        z <- 1 until n + 1 if (x * x) + (y * y) == (z * z) && x < y
    yield (x, y, z)
    triples.toList
  }



