object Twofer {
  def twofer(name: String = ""): String = {
    if (name.equals("")) {
      "One for you, one for me."
    } else {
      "One for " + name + ", one for me."
    }
  }
}
