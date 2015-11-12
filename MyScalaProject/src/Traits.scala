

/**
 * @author harikanththatikonda
 */
//class Traits {
  trait logger{
    def log (msg: String)
  }
  class Account{
    protected val bal=100
  }
  
  class savings extends Account with logger{
    def withdraw(amt :Int){
      if( bal < amt)
        log("Insufficient funds,..")
    }
    def log(msg: String){
      println(msg)
    }
  }
  
//}

object traitsample extends App{
    val Acc= new savings
    Acc.withdraw(500)
  }