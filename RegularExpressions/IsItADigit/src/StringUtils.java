public class StringUtils {  
  public static boolean isDigit(String s) {
    String OneDigitRegex = "[0-9]";
    return s.matches(OneDigitRegex);
  }
}
