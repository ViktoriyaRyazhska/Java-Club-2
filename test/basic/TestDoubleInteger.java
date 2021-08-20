package basic;

import com.softserve.academy.basic.DoubleInteger;
import org.junit.Assert;
import org.junit.Test;

public class TestDoubleInteger {
    @Test
    public final void test_all() {
        Assert.assertEquals("Nope!", 4, DoubleInteger.doubleInteger(2));
        Assert.assertEquals("Nope!", 6,  DoubleInteger.doubleInteger(3));
    }
}
