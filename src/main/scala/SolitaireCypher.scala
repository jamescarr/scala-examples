
class SolitaireCypher{
  def discardNonAlpha(input:String):String = {
    val cleaned = input.replaceAll("[^A-Za-z]", "").toUpperCase()
    "(.{0,5})".r.replaceAllIn(cleaned, "$1 ").trim()
  }
}
