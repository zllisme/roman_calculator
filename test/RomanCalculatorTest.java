import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanCalculatorTest {

  @Test
  public void should_return_II_when_roman_number_add_given_I_and_I() {
    RomanCalculator romanCalculator = new RomanCalculator();
    RomanNumeral roman1 = new RomanNumeral("I");
    RomanNumeral roman2 = new RomanNumeral("I");
    RomanNumeral result = romanCalculator.add(roman1, roman2);
    assertEquals("II", result.getRomanNum());
  }

  @Test
  public void should_return_III_when_roman_number_add_given_I_and_II() {
    RomanCalculator romanCalculator = new RomanCalculator();
    RomanNumeral roman1 = new RomanNumeral("I");
    RomanNumeral roman2 = new RomanNumeral("II");
    RomanNumeral result = romanCalculator.add(roman1, roman2);
    assertEquals("III", result.getRomanNum());
  }

  @Test
  public void should_return_IV_when_roman_number_add_given_II_and_II() {
    RomanCalculator romanCalculator = new RomanCalculator();
    RomanNumeral roman1 = new RomanNumeral("II");
    RomanNumeral roman2 = new RomanNumeral("II");
    RomanNumeral result = romanCalculator.add(roman1, roman2);
    assertEquals("IV", result.getRomanNum());
  }

  @Test
  public void should_return_X_when_roman_number_add_given_V_and_V() {
    RomanCalculator romanCalculator = new RomanCalculator();
    RomanNumeral roman1 = new RomanNumeral("V");
    RomanNumeral roman2 = new RomanNumeral("V");
    RomanNumeral result = romanCalculator.add(roman1, roman2);
    assertEquals("X", result.getRomanNum());
  }

  @Test
  public void should_return_VIII_when_roman_number_add_given_IV_and_IV() {
    RomanCalculator romanCalculator = new RomanCalculator();
    RomanNumeral roman1 = new RomanNumeral("IV");
    RomanNumeral roman2 = new RomanNumeral("IV");
    RomanNumeral result = romanCalculator.add(roman1, roman2);
    assertEquals("VIII", result.getRomanNum());
  }
}