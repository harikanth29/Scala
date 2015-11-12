

/**
 * @author harikanththatikonda
 */
//object DemoPrint {
//  def main(args: Array[String]): Unit ={}
//  println("Welcome to Scla!!!!!")
//  
//}
class duck( val id:Int,val size1:Int ){
  var age =id
  var size=size1
  println("msg1")
  println("in declaration")
//These below constructs are needed to give this class of method overloading capability
//  def this(age: Int){
//    this()
//    this.age = age
//}
//  def this(age: Int,size: Int){
//    this(age)
//    this.size=size
//  }
  def msg(){
    
  println("age is:"+this.age+" size is "+this.size)
  }
}
object dobj extends App{
  val d1 = new duck(4,5)
//  val d2 = new duck(3)
//  val d3 = new duck()
  d1.msg
//  d2.msg
//  d3.msg
}