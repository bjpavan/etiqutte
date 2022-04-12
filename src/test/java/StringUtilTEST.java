import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilTEST {

    @Test
    public void shouldGetLengthOfAString() {

        int length = "HelloWorld!".length();
        Assert.assertEquals(length,11);
    }

    @Test
    public void shouldAddTwoNumbers() {

        int sum = new Calculator().getSumOfAddition(10, 20);

        Assert.assertEquals(30, sum);
    }

    @Test
    public void shouldMultiplyTwoNumber() {
        int result = new Calculator().getResultOfMultiplication(10, 10);

        Assert.assertEquals(100, result);
    }


}
