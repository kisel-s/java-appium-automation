import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    private int localNumber = 14;

    @Test
    public void testGetLocalNumber() {
        int actualLocalNumber = JavaMainClass.getLocalNumber();
        Assert.assertEquals(String.format("Expected localNumber - %d, but actual is %d", localNumber, actualLocalNumber),
                localNumber, actualLocalNumber);
    }
}
