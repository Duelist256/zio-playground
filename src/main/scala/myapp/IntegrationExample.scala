package myapp

import zio.DefaultRuntime
import zio.console._

object IntegrationExample extends App {
  val runtime = new DefaultRuntime {}

  runtime.unsafeRun(putStrLn("Hello world"))
}
