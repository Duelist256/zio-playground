package myapp

import java.io.IOException

import zio.{URIO, ZIO}
import zio.console._

object MyApp extends zio.App {
  def run(args: List[String]): URIO[Console, Int] =
    myAppLogic.fold(_ => 1, _ => 0)

    val myAppLogic: ZIO[Console, IOException, Unit] =
      for {
        _ <- putStrLn("Hello! What's your name?")
        name <- getStrLn
        _ <- putStrLn(s"Hello, ${name}, welcome to ZIO!")
      } yield ()
}