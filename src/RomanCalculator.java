class RomanCalculator {
  RomanNumeral add(RomanNumeral roman1, RomanNumeral roman2) {
    int resultInt = roman1.getIntValue() + roman2.getIntValue();
    String romanNum = RomanNumeralConverter.convertIntToRoman(resultInt);
    return new RomanNumeral(romanNum, resultInt);
  }
}
