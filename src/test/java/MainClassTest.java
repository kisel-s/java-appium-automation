import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    private int localNumber = 14;
    private int classNumber = 45;

    @Test
    public void testGetLocalNumber() {
        int actualLocalNumber = JavaMainClass.getLocalNumber();
        Assert.assertEquals(String.format("Expected localNumber - %d, but actual is %d", localNumber,
                actualLocalNumber), localNumber, actualLocalNumber);
    }

    @Test
    public void testGetClassNumber() {
        int actualClassNumber = JavaMainClass.getClassNumber();
        Assert.assertTrue(String.format("Actual classNumber %d is not > %d", actualClassNumber, classNumber),
                actualClassNumber > classNumber);
    }

    @Test
    public void testGetClassString() {
        String classStringSubString1 = "hello";
        String classStringSubString2 = "Hello";
        String actualClassString = new JavaMainClass().getClassString();
        Assert.assertTrue(String.format("Actual classString '%s' is not contain any of ['%s', '%s']", actualClassString,
                classStringSubString1, classStringSubString2),
                actualClassString.contains(classStringSubString1) || actualClassString.contains(classStringSubString2));
    }
}
