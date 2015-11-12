

import scala.collection.mutable.ArrayBuffer

class Graph() {
  class Member(){
    var name=""
    def this( name:String){
        this()
        this.name=name
    }
    val contacts = new ArrayBuffer[Member]
  }
  private val members = new ArrayBuffer[Member]
  def join( name:String)={
    val  m=new Member(name)
    members+=m
    m
  }
}
object demp extends App{
    val chattergrp= new Graph
    val chatgrp2=new Graph
    val hk =chattergrp.join("Hari")
    val van=chattergrp.join("Vanni")
    hk.contacts+=van
    val mm= chatgrp2.join("BT")
//    hk.contacts+=mm
    println(hk.contacts(0).name)
  
}