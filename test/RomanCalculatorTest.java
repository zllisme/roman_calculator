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

}