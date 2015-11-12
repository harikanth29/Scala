

/**
 * @author harikanththatikonda
 */
class ProjectWork1 {
  
  var map= scala.collection.mutable.Map[String,Int]()
  def process={
  import scala.io.Source
  import scala.collection.immutable.ListMap
  val file = scala.io.Source.fromFile("/Users/harikanththatikonda/Downloads/cdr1.txt")
  var lines=file.getLines()
  var i=0
      lines.foreach(processLine)
//     val resMap=ListMap(map.toSeq.sortBy(_._2):_*)
     val resMap=ListMap(map.toSeq.sortWith(_._2>_._2):_*)
//      val resMap=map.valuesIterator.reduceLeft((x,y)=> if(x>y)x else y)
//      map.foreach(println)
      resMap.foreach(println)
  }
  
  def processLine(str: String)={
    val arr=str.split(",")
    
    if(arr(3).equalsIgnoreCase("0x829F08")){
      val intialcount =1
      var value=map.getOrElse(arr(0),0)
      if(value ==0){
         map.+=(arr(0)->intialcount)
        
      }else{
//        var count=map.getOrElse(arr(0),0)
//        println("value of count"+value +".updating map with 1 for key "+arr(0))
        value=value+1
        map.+=(arr(0)->value)
        
      }
    
    }  
//      println(map.foreach(println))
    map
  }
}

object proj extends App{
  val file1 = new ProjectWork
  val resMap = file1.process
  println(resMap)

}