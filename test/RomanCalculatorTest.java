import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class RomanCalculatorTest {

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void should_return_II_when_roman_number_add_given_I_and_I() throws InvalidInputDataException {
    RomanCalculator romanCalculator = new RomanCalculator();
    RomanNumeral roman1 = new RomanNumeral("I");
    RomanNumeral roman2 = new RomanNumeral("I");
    RomanNumeral result = romanCalculator.add(roman1, roman2);
    assertEquals("II", result.getRomanNum());
  }

  @Test
  public void should_return_III_when_roman_number_add_given_I_and_II() throws InvalidInputDataException {
    RomanCalculator romanCalculator = new RomanCalculator();
    RomanNumeral roman1 = new RomanNumeral("I");
    RomanNumeral roman2 = new RomanNumeral("II");
    RomanNumeral result = romanCalculator.add(roman1, roman2);
    assertEquals("III", result.getRomanNum());
  }

  @Test
  public void should_return_IV_when_roman_number_add_given_II_and_II() throws InvalidInputDataException {
    RomanCalculator romanCalculator = new RomanCalculator();
    RomanNumeral roman1 = new RomanNumeral("II");
    RomanNumeral roman2 = new RomanNumeral("II");
    RomanNumeral result = romanCalculator.add(roman1, roman2);
    assertEquals("IV", result.getRomanNum());
  }

  @Test
  public void should_return_X_when_roman_number_add_given_V_and_V() throws InvalidInputDataException {
    RomanCalculator romanCalculator = new RomanCalculator();
    RomanNumeral roman1 = new RomanNumeral("V");
    RomanNumeral roman2 = new RomanNumeral("V");
    RomanNumeral result = romanCalculator.add(roman1, roman2);
    assertEquals("X", result.getRomanNum());
  }

  @Test
  public void should_return_VIII_when_roman_number_add_given_IV_and_IV() throws InvalidInputDataException {
    RomanCalculator romanCalculator = new RomanCalculator();
    RomanNumeral roman1 = new RomanNumeral("IV");
    RomanNumeral roman2 = new RomanNumeral("IV");
    RomanNumeral result = romanCalculator.add(roman1, roman2);
    assertEquals("VIII", result.getRomanNum());
  }

  @Test
  public void should_return_MCDL_when_roman_number_add_given_CM_and_DL() throws InvalidInputDataException {
    RomanCalculator romanCalculator = new RomanCalculator();
    RomanNumeral roman1 = new RomanNumeral("CM");
    RomanNumeral roman2 = new RomanNumeral("DL");
    RomanNumeral result = romanCalculator.add(roman1, roman2);
    assertEquals("MCDL", result.getRomanNum());
  }

  @Test
  public void should_throw_InvalidInputDataException_when_roman_number_add_given_MI_and_V() throws InvalidInputDataException {
    RomanCalculator romanCalculator = new RomanCalculator();
    RomanNumeral roman1 = new RomanNumeral("MI");
    RomanNumeral roman2 = new RomanNumeral("V");
    thrown.expect(InvalidInputDataException.class);
    thrown.expectMessage("Roman number is more than one thousand");
    romanCalculator.add(roman1, roman2);
  }

  @Test
  public void should_throw_InvalidInputDataException_when_roman_number_add_given_IIV_and_V() throws InvalidInputDataException {
    RomanCalculator romanCalculator = new RomanCalculator();
    RomanNumeral roman1 = new RomanNumeral("IIV");
    RomanNumeral roman2 = new RomanNumeral("DL");
    thrown.expect(InvalidInputDataException.class);
    thrown.expectMessage("Invalid roman numeral!");
    romanCalculator.add(roman1, roman2);
  }
}