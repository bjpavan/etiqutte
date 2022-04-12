import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilTEST {

    @Test
    public void shouldGetLengthOfAString() {
        String testString = "HelloWorld!";
        Assert.assertEquals(testString.length(),11);
    }
}
