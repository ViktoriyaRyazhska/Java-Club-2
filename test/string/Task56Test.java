package string;

import com.softserve.academy.string.Task56;
import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task56Test {

    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals( "Nope!", "Martin does not play banjo", Task56.areYouPlayingBanjo("Martin"));
        assertEquals( "Nope!", "Rikke plays banjo", Task56.areYouPlayingBanjo("Rikke"));
    }

}
