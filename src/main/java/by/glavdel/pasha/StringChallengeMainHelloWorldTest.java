package by.glavdel.pasha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringChallengeMainHelloWorldTest {

    @Test
    void stringChallengee() {
        String line = "hello world";
        String excpect = "Hello World";
        assertEquals(excpect, StringChallengeMainHelloWorld.stringChallengee(line));
    }

    @Test
    void stringChallengeeSecond() {
        String line = "i ran there";
        String excpect = "I Ran There";
        assertEquals(excpect, StringChallengeMainHelloWorld.stringChallengee(line));
    }

    @Test
    void stringChallengeeOneLetter() {
        String line = "u y";
        String excpect = "U Y";
        assertEquals(excpect, StringChallengeMainHelloWorld.stringChallengee(line));
    }
}