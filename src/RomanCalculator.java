class RomanCalculator {
  RomanNumeral add(RomanNumeral roman1, RomanNumeral roman2) throws InvalidInputDataException {
    if (roman1.getIntValue() > 1000 || roman2.getIntValue() > 1000) {
      throw new InvalidInputDataException();
    }
    int resultInt = roman1.getIntValue() + roman2.getIntValue();
    String romanNum = RomanNumeralConverter.convertIntToRoman(resultInt);
    return new RomanNumeral(romanNum, resultInt);
  }
}
