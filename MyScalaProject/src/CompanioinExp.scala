

/**
 * @author harikanththatikonda
 */
class CompanioinExp private (val id1: Int, ibal: Double) {
  private var id = id1
  private var bal = ibal
  def desc = {
    println("ac no " + id + " having bal:" + bal)
  }
  //  def this(id:Int,bal:Double)={
  //    this()
  //    this.id = id
  //    this.bal=bal
  //  }
  //  
}
object CompanioinExp {
  def apply(bal: Double) = {
    new CompanioinExp(acnum(), bal)
  }
  var nextnum = 0
  private def acnum() = {
    nextnum += 1
    nextnum
  }
}
object demoCmp extends App{
  val ac1=CompanioinExp(100)
  println(ac1.desc)
  val ac2=CompanioinExp(200)
  ac2.desc
}