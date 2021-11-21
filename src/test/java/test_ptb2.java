import org.junit.Assert;
import org.junit.Test;
public class test_ptb2 {
    @Test
    public void testPt1() {
        final String expected = "Errors!!!";
        final String actual = ptb2.PTB2(0, 0, 0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPt2() {
        final String expected = "No results";
        final String actual = ptb2.PTB2(3, 2, 5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPt3() {
        final String expected = "x1 = x2 = 2.0";
        final String actual = ptb2.PTB2(1, -4, 4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPt4() {
        final String expected = "x1 = 3.0; x2 = 0.5";
        final String actual = ptb2.PTB2(2, -7, 3);
        Assert.assertEquals(expected, actual);
    }
}

