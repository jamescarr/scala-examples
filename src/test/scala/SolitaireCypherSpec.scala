import org.specs._

object solitaireCypherSpec extends Specification {  
  var message = "Code in ruby live 2 longer!"
  val encryptor = new SolitaireCypher
  "discard any non A-Z characters" in {     
     val result = encryptor.discardNonAlpha("O>NE!T@W")
     
     result must be matching ("^[A-Za-z]+$")
  }
  
  "uppercase all characters" in {
     val result = encryptor.discardNonAlpha("ONETW")
     
     result must be matching ("^[A-Z]+$")
  }
  
  "put a space after each fifth character" in {
      val result = encryptor.discardNonAlpha(message)
      
      result must be matching("CODEI NRUBY LIVEL ONGER")
  }
  
}
