package javaClub.team3.Tests;

import javaClub.team3.Task56.Banjo;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Task56Test {
    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals( "Nope!", "Martin does not play banjo", Banjo.areYouPlayingBanjo("Martin"));
        assertEquals( "Nope!", "Rikke plays banjo", Banjo.areYouPlayingBanjo("Rikke"));
    }
}
