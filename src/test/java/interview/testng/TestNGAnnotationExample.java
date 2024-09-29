package interview.testng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MySampleListener.class)
public class TestNGAnnotationExample {
    @Test
    public void myTest() {
        System.out.println("TEST START");
        Assert.assertEquals("","");
    }
}
