package OPP;

import com.softserve.academy.opp.Task3;
import static org.junit.Assert.*;
import org.junit.Test;

public class Task3Test {
    @Test
    public void simpleTest(){
        assertTrue("empty string", Task3.encode("").equals(""));
        assertTrue("abcdef string", Task3.encode("abcdef").equals("4bcd3f"));
    }
}
