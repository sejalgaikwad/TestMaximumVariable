import MaximumVariable.MaximumVariable;
import org.junit.Assert;
import org.junit.Test;

public class MaximumVariableTest {
    @Test
    public void whenGivenThreeIntegers_shouldReturnFirstVariableMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        int firstNumber = maximumVariable.maximumInteger(23, 12, 21);
        Assert.assertEquals(23, firstNumber);
    }

    @Test
    public void whenGivenThreeIntegers_shouldReturnSecondVariableMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        int secondNumber = maximumVariable.maximumInteger(12, 31, 21);
        Assert.assertEquals(31, secondNumber);
    }

    @Test
    public void whenGivenThreeIntegers_shouldReturnThirdVariableMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        int thirdNumber = maximumVariable.maximumInteger(9, 12, 21);
        Assert.assertEquals(21, thirdNumber);
    }

    @Test
    public void whenGivenThreeFloat_shouldReturnFirstValueMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        float firstFloat = maximumVariable.maximumFloat(27.1f, 12.4f, 21.5f);
        Assert.assertEquals(27.1f, firstFloat, 0.0);
    }

    @Test
    public void whenGivenThreeFloat_shouldReturnSecondValueMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        float secondFloat = maximumVariable.maximumFloat(2.1f, 29.4f, 21.5f);
        Assert.assertEquals(29.4f, secondFloat, 0.0);
    }

    @Test
    public void whenGivenThreeFloat_shouldReturnThirdVariableMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        float thirdFloat = maximumVariable.maximumFloat(2.1f, 12.4f, 21.5f);
        Assert.assertEquals(21.5f, thirdFloat, 0.0);
    }

    @Test
    public void whenGivenThreeString_shouldReturnFirstValueMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        String firstString = maximumVariable.maximumString("Peach","Apple","Banana");
        Assert.assertEquals("Peach", firstString);
    }

    @Test
    public void whenGivenThreeString_shouldReturnSecondValueMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        String secondString = maximumVariable.maximumString("Apple","Peach","Banana");
        Assert.assertEquals("Peach", secondString);
    }

    @Test
    public void whenGivenThreeString_shouldReturnThirdValueMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        String thirdString = maximumVariable.maximumString("Apple","Banana","Peach");
        Assert.assertEquals("Peach", thirdString);
    }
}
