class RomanNumeral {
  private String romanNum;
  private int intValue;

  public int getIntValue() {
    return intValue;
  }

  RomanNumeral(String romanNum) {
    this.romanNum = romanNum;
    this.intValue = RomanNumeralConverter.convertRomanToInt(romanNum);
  }

  public RomanNumeral(String romanNum, int intValue) {
    this.romanNum = romanNum;
    this.intValue = intValue;
  }

  String getRomanNum() {
    return romanNum;
  }
}
