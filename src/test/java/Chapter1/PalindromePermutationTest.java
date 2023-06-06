package Chapter1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromePermutationTest {
    PalindromePermutation palindromePermutation = new PalindromePermutation();

    @Test
    public void palindromePermutationTest(){
        String answer = "catt oca";
        String answer2 = "saykka";
        assertEquals(true, palindromePermutation.permutationOfAPalindrome(answer));
        assertEquals(false, palindromePermutation.permutationOfAPalindrome(answer2));
    }
}
