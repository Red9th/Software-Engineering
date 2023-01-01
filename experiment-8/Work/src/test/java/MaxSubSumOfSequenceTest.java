import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSubSumOfSequenceTest {
    @Test
    public void testSolve() {
        assertEquals(0, MaxSubSumOfSequence.solve(new int[]{0}, 0));
        assertEquals(0, MaxSubSumOfSequence.solve(new int[]{0, -1, -2}, 2));
        assertEquals(8, MaxSubSumOfSequence.solve(new int[]{0, 1, -2, 3, 5, -1}, 5));
    }
}
