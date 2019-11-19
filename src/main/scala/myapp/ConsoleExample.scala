package myapp

import zio.console._

object ConsoleExample extends zio.App {
  def run(args: List[String]) = {
    val echo = getStrLn flatMap putStrLn
    echo.fold(_ => 1, _ => 1)
  }
}
