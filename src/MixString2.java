public class MixString2 {
  public String mixString(String a, String b) {
    String result = "";

    for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
      result += "" + a.charAt(i) + b.charAt(i);
    }
    if (a.length() > b.length()) {
      return result + a.substring(b.length());
    }
    return result + b.substring(a.length());
  }

}
