package Chapter1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OneAwayTest {
    OneAway oneAway = new OneAway();
    
    @Test
    public void oneAwayTest(){
        assertEquals(true, oneAway.checkIfStringIsOneEditAway("bake", "make"));
        assertEquals(false, oneAway.checkIfStringIsOneEditAway("bake", "male"));
        assertEquals(true, oneAway.checkIfStringIsOneEditAway("aker", "baker"));
    }
}
