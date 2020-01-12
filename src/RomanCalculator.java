class RomanCalculator {
  RomanNumeral add(RomanNumeral roman1, RomanNumeral roman2) {
    return new RomanNumeral(roman1.getRomanNum() + roman2.getRomanNum());
  }
}
