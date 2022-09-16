package by.glavdel.pasha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringChallengeMainTest {

    @Test
    void stringChallengeFirst() {
        String line = "99946";
        String excpect = "9-9-94*6";
        assertEquals(excpect, StringChallengeMain.stringChallenge(line));
    }

    @Test
    void stringChallengeSecond() {
        String line = "56647304";
        String excpect = "56*6*47-304";
        assertEquals(excpect, StringChallengeMain.stringChallenge(line));
    }
}