import org.specs._
object solitaireCypherSpec extends Specification {
  
  "discard any non A-Z characters" in {
     val message = "Code in ruby live 2 longer!"
     val encryptor = new SolitaireCypher
     
     val result = encryptor.discardNonAlpha(message)
     
     result must be matching ("^[A-Za-z]+$")
  }
  
  "uppercase all characters" in {
     val message = "Code in ruby live 2 longer!"
     val encryptor = new SolitaireCypher
     
     val result = encryptor.discardNonAlpha(message)
     
     result must be matching ("^[A-Z]+$")
  }
  "should split the message into 5 character groups" in {
     val message = "Code in ruby live 2 longer!"
     val encryptor = new SolitaireCypher
     
     val result = encryptor.discardNonAlpha(message)
     
     result must be ("CODEI NRUBY LIVEL ONGER")
  }
  
}
