import org.specs._

object solitaireCypherSpec extends Specification { 
  val encryptor = new SolitaireCypher
  "should discard any non A-Z characters" in {     
     val result = encryptor.discardNonAlpha("O>NE!T@W")
     
     result must be matching ("^[A-Za-z]+$")
  }
  
  "should uppercase all characters" in {
     val result = encryptor.discardNonAlpha("ONETW")
     
     result must be matching ("^[A-Z]+$")
  }
  
  "should put a space after each fifth character except last one" in {
      val result = encryptor.discardNonAlpha("Code in ruby live 2 longer!")
      
      result must be matching("CODEI NRUBY LIVEL ONGER")
  }
  
  "should pad remaining space with Xs" in {
      val result = encryptor.discardNonAlpha("Code in scala live forever")
      
      result must be matching("CODEI NSCAL ALIVE FOREV ERXXX")
  }
  
}
