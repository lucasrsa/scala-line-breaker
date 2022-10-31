@main def main(text: String, limit: Int): Unit = {
  println(s"Limit: $limit")
  var str = ""
  text.split(" ").foreach(word => if (str.isEmpty) {
    str = word
  } else if (str.length + word.length < limit) {
    str = s"$str $word"
  } else {
    println(str)
    str = word
  })
  println(str)
}
