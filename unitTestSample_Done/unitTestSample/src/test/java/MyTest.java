/**
 * Created by Litslink on 7/8/2016.
 */
import org.junit.Assert;
import org.junit.Test;

public class MyTest {

    @Test
    public void FirstTest() {
        Assert.assertEquals(LoopVerification.MyFunction()[0],19);
    }

    @Test
    public void SecondTest() {
        Assert.assertEquals(LoopVerification.MyFunction()[1],2);
    }

    @Test
    public void ThirdTest() {
        Assert.assertNotNull(LoopVerification.MyFunction());
    }
}
