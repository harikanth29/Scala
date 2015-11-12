

/**
 * @author harikanththatikonda
 */
class ProjectWork {
  
  var map= scala.collection.mutable.Map[String,Int]()
  def process={
  import scala.io.Source
  import scala.collection.immutable.ListMap
  val file = scala.io.Source.fromFile("/Users/harikanththatikonda/Downloads/CDR.csv")
  var lines=file.getLines()
  var i=0
      lines.foreach(processCallData)
     val resMap=ListMap(map.toSeq.sortWith(_._2>_._2):_*).iterator.slice(0, 10)
      resMap
  }
  
  def processCallData(str: String) = {
    val arr=str.split(",")
    if(arr(3).equalsIgnoreCase("0x829F08")){
      val intialcount =1
      var value=map.getOrElse(arr(0),0)
      if(value ==0){
         map.+=(arr(0)->intialcount)
      }else{
        value=value+1
        map.+=(arr(0)->value)
      }
    }  
//      println(map.foreach(println))
    map
  }
}

object project extends App{
  val file1 = new ProjectWork
  val resMap = file1.process
  println("Top Ten Customers facing call drop problem are:")
  resMap.foreach(println)
}