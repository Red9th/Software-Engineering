import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSubSumOfSequenceTest {
    @Test
    public void testSolve() {
        assertEquals(1, MaxSubSumOfSequence.solve(new int[]{0, 1}, 1));
        assertEquals(0, MaxSubSumOfSequence.solve(new int[]{0, -1}, 1));
        assertEquals(3, MaxSubSumOfSequence.solve(new int[]{0, 1, 2}, 2));
        assertEquals(0, MaxSubSumOfSequence.solve(new int[]{0, -1, -2}, 2));
    }
}
