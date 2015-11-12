

/**
 * @author harikanththatikonda
 */
class FileProcessing {
  var map= scala.collection.mutable.Map[String,Int]()
  def process={
  import scala.io.Source
  
  val file = scala.io.Source.fromFile("/Users/harikanththatikonda/Downloads/cdr1.txt")
  var lines=file.getLines()
  var i=0
//  lines.foreach(println)
//  while(i<=lines.length){
//    if(lines.hasNext){
      lines.foreach(processLine)
//    val line= lines.next
////    if (line.contains(0x829F08)){
//      println(line)
//    }
//    i +=1
//  }
//  }
  }
  
  def processLine(str: String)={
    val arr=str.split(",")
    var intialcount =1
//    val map= scala.collection.mutable.Map[String,Int]()
    if(arr(3).equalsIgnoreCase("0x829F08")){
      if(map.get(arr(0))!= null){
        var count=map.getOrElse(arr(0),0)
        count=count+1
        map.+=(arr(0)->count)
      }else{
        var count=1
        map.+=(arr(0)->count)
      }
    
    }  
//      println(map.foreach(println))
    map
  }
}

object file extends App{
  val file1 = new FileProcessing
  val resMap = file1.process
  println(resMap)
}