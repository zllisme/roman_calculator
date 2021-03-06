class RomanCalculator {
  RomanNumeral add(RomanNumeral roman1, RomanNumeral roman2) throws InvalidInputDataException {
    validateInputRoman(roman1, roman2);
    int resultInt = roman1.getIntValue() + roman2.getIntValue();
    String romanNum = RomanNumeralConverter.convertIntToRoman(resultInt);
    return new RomanNumeral(romanNum, resultInt);
  }

  private void validateInputRoman(RomanNumeral roman1, RomanNumeral roman2) throws InvalidInputDataException {
    if(isRomanInvalid(roman1) || isRomanInvalid(roman2)) {
      throw new InvalidInputDataException("Invalid roman numeral!");
    }
    if (roman1.getIntValue() > 1000 || roman2.getIntValue() > 1000) {
      throw new InvalidInputDataException("Roman number is more than one thousand");
    }
  }

  private boolean isRomanInvalid(RomanNumeral roman) {
    return roman.getIntValue() == -1 || !roman.getRomanNum().equals(RomanNumeralConverter.convertIntToRoman(roman.getIntValue()));
  }
}
