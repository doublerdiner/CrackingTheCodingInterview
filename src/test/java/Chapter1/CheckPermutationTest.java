package Chapter1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckPermutationTest {
    CheckPermutation checkPermutation = new CheckPermutation();

    @Test
    public void checkifWordsAreAPermutation(){
        assertEquals(true, checkPermutation.permutationChecker("Christopher", "eptorishChr"));
        assertEquals(false, checkPermutation.permutationChecker("Christopher", "eptorishCh"));
        assertEquals(false, checkPermutation.permutationChecker("Christopher", "eptorishChp"));
    }
}
