

/**
 * @author harikanththatikonda
 */
 trait logger1{
    def log (msg: String)
  }
  class Account1{
    protected val bal=100
  }
  
  class savings1 extends Account1 with logger{
    def withdraw(amt :Int){
      if( bal < amt)
        log("Insufficient funds,..")
    }
    def log(msg: String){
      println(msg)
    }
  }
  
//}

object traitsample1 extends App{
    val Acc= new savings1
    Acc.withdraw(500)
  }