
class SolitaireCypher{
  def discardNonAlpha(input:String):String = {
    input.replaceAll("[^A-Za-z]", "").toUpperCase()
  }
}
