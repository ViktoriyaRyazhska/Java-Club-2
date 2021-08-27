package collections;

import com.softserve.academy.basic.Task4;
import com.softserve.academy.collections.Task72;
import org.junit.Assert;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task72Test {
    public void fixedTests() {
        Task72.Dictionary d = new Task72.Dictionary();
        assertTrue(d.add_word("apple", "i love"));
        assertFalse(d.add_word("apple", "hello"));
        Assert.assertEquals(d.look("apple"), "i love");

    }
}
