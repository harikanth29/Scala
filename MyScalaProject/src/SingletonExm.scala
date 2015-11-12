

/**
 * @author harikanththatikonda
 */
object SingletonExm {
  private var counter = 0
  def nextCounter = {
    counter += 1
    counter
  }
}
object demo extends App {
  val r1 = SingletonExm.nextCounter
  val r2 = SingletonExm.nextCounter
  val r3 = SingletonExm.nextCounter
  println(r1)
  println(r2)
  println(r3)
}
