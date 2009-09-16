
class SolitaireCypher{
  def discardNonAlpha(input:String):String = {
    val cleaned = input.replaceAll("[^A-Za-z]", "").toUpperCase().trim()
    var result = cleaned + ("X" * numberOfXs(cleaned))
    "(.{0,5})".r.replaceAllIn(result, "$1 ").trim()
  }
  private def numberOfXs(s:String):Int={
    return if(s.length % 5 == 0) 0 else s.length % 5 +1
  }
}
