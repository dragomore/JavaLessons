package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetUniqueNumberListInOrderTest {

    @Test
    void uniqueInOrder() {
        StringBuilder expectedOutput = new StringBuilder("13232");
        String input = "111333223322";
        assertEquals(expectedOutput, GetUniqueNumberListInOrder.uniqueInOrder(input));
    }
}