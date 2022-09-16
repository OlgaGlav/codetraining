package by.glavdel.pasha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {
    GameTest() {
    }

    @Test
    void testFirst() {
        int[][] field = new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 0, 0, 1}};
        int[][] expect = new int[][]{{1, 0, 0, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 0, 0, 1}};
        Assertions.assertArrayEquals(expect, Game.newState(field));
    }

    @Test
    void testSecond() {
        int[][] field = new int[][]{{1, 0, 1, 1}, {1, 1, 0, 1}, {1, 0, 1, 1}, {1, 1, 0, 1}};
        int[][] expect = new int[][]{{1, 0, 1, 1}, {1, 0, 0, 0}, {0, 0, 0, 1}, {1, 1, 0, 1}};
        Assertions.assertArrayEquals(expect, Game.newState(field));
    }
}

