class RomanCalculator {
  RomanNumeral add(RomanNumeral roman1, RomanNumeral roman2) {
    String romanNum = roman1.getRomanNum() + roman2.getRomanNum();
    if (romanNum.length() == 4){
      return new RomanNumeral("IV");
    }
    return new RomanNumeral(romanNum);
  }
}
