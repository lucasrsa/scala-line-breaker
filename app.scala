object CMDExample extends App {
  if (args.length != 2) {
    throw new IllegalArgumentException("Wrong number of parameters, 2 parameters should be given")
  }
  val text: String = args(0)
  try {
    val limit: Int = args(1).toInt
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
  } catch {
    case e: Exception => throw new IllegalArgumentException("Wrong parameter format, second parameter should be an integer")
  }
}
