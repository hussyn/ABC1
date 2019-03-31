package report;

import org.testng.Assert;
import org.testng.annotations.Test;
 
public class VigoReportDemo
{
    @Test
    public void firstTest()
    {
        Assert.assertEquals("Krishna", "Sakinala","Assert failed as both the values are not Equal");
    }
     
    @Test
    public void secondTest()
    {
        Assert.assertEquals("Krishna", "Krishna");
        System.out.println("Both the values matched");
    }
     
    @Test
    public void thirdTest()
    {
        Assert.assertTrue(1 &gt; 0,"Assert failed as condition is wrong");
        System.out.println("Condition is True");
    }
     
    @Test
    public void fourthTest()
    {
        Assert.assertFalse(1 &gt; 0, "Assert failed as condition is wrong");
    }
}