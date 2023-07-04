package exercise2


object Exercise2:
  def divisors(n : Int): List[Int] = {
    val ds = for i <- 2 until n / 2 if n % i == 0
    yield i
    ds.toList
  }

  def primes(n : Int): List[Int] = {
    val ps = for i <- 2 until n if divisors(i).isEmpty
    yield i
    ps.toList
  }

  def join(sep: String, list: List[String]): String = {
    list.foldLeft(" "){(acc, ele) => acc + ele + sep}
  }

  def pythagorean(n: Int) : List[(Int, Int, Int)] = {
    val triples = for x <- 1 until n
        y <- 1 until n
        z <- 1 until n if (x * x) + (y * y) == (z * z)
    yield (x, y, z)
    triples.toList
  }



