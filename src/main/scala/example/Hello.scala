package example

import zio.query._

object Hello extends Greeting with App {
  val query = ZQuery.succeed(greeting)

  println(query)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
