package basic;

import com.softserve.academy.basic.Task4;
import com.softserve.academy.basic.Task7;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class Task7Test {
    @Test
    public void fixedTests() {
        Assert.assertEquals(Task7.exact_time(0,1,1), 61000);
        Assert.assertEquals(Task7.exact_time(0, 10,0), 600000);
        Assert.assertEquals(Task7.exact_time(0, 10,15), 750000);

    }
}
