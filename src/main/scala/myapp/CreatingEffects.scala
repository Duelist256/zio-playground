package myapp

import zio.{Task, UIO, ZIO}

object CreatingEffects {
  def main(args: Array[String]): Unit = {
    // eager construction
    val s1: UIO[Int] = ZIO.succeed(42)
    val s2: Task[Int] = Task.succeed(42)

    // lazy construction
    lazy val bigList: List[Int] = (0 to 1000000).toList
    lazy val bigString = bigList.map(_.toString).mkString("\n")
    val s3 = ZIO.effectTotal(bigString)

    // from failure
  val f1: ZIO[Any, String, Int] = ZIO.fail("Uh oh!")
}
}
