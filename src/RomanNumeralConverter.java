import java.util.HashMap;
import java.util.Map;

public class RomanNumeralConverter {

  private static Map<Character, Integer> baseRomanToIntMap = new HashMap<Character, Integer>() {
    {
      put('I', 1);
      put('V', 5);
      put('X', 10);
      put('L', 50);
      put('C', 100);
      put('D', 500);
      put('M', 1000);
    }
  };

  private static String[][] romanRule = new String[][]{
      {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
      {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
      {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
      {"", "M"}
  };

  static int convertRomanToInt(String romanNumeral) {
    if (isRomanHasInvalidChar(romanNumeral)) {
      return -1;
    }
    int resultInt = baseRomanToIntMap.get(romanNumeral.charAt(romanNumeral.length() - 1));
    for (int i = romanNumeral.length() - 1; i > 0; i--) {
      Integer currentInt = baseRomanToIntMap.get(romanNumeral.charAt(i));
      Integer previousInt = baseRomanToIntMap.get(romanNumeral.charAt(i - 1));
      resultInt = currentInt > previousInt ? resultInt - previousInt : resultInt + previousInt;
    }
    return resultInt;
  }

  private static boolean isRomanHasInvalidChar(String romanNumeral) {
    for (int i = 0; i < romanNumeral.length(); i++) {
      if(!baseRomanToIntMap.keySet().contains(romanNumeral.charAt(i))) {
        return true;
      }
    }
    return false;
  }

  static String convertIntToRoman(int intNum) {
    String romanNumeral = "";
    romanNumeral += romanRule[3][intNum / 1000 % 10];
    romanNumeral += romanRule[2][intNum / 100 % 10];
    romanNumeral += romanRule[1][intNum / 10 % 10];
    romanNumeral += romanRule[0][intNum % 10];
    return romanNumeral;
  }
}
