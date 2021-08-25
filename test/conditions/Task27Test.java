package conditions;

import com.softserve.academy.basic.Task4;
import com.softserve.academy.basic.Task7;
import com.softserve.academy.conditions.Task27;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class Task27Test {
    @Test
    public void fixedTests() {
        Assert.assertEquals(Task27.Enough(50,25,10), 0 );
        Assert.assertEquals(Task27.Enough(50, 0,10),  0);
        Assert.assertEquals(Task27.Enough(50, 10,0), 0);
        Assert.assertEquals(Task27.Enough(10, 10,0), 0);
        Assert.assertEquals(Task27.Enough(10, 5,5), 0);
        Assert.assertNotEquals(Task27.Enough(10, 5,6), 0);
        Assert.assertNotEquals(Task27.Enough(10, 0,11), 0);
        

    }
}
