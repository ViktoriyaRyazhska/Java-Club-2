package loops;

import com.softserve.academy.loops.Task32;
import org.junit.Assert;
import org.junit.Test;

public class Task32Test {
    @Test
    public void fixedTests() {
        Assert.assertEquals("", Task32.repeatStr( 5, ""));
        Assert.assertEquals("appleapple", Task32.repeatStr( 2, "apple"));
        Assert.assertEquals("APPLE APPLE APPLE ", Task32.repeatStr( 3, "APPLE "));
    }
    }

