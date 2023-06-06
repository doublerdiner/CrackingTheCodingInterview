package Chapter1;

import Chapter1.IsUnique;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsUniqueTest {
    IsUnique isUnique = new IsUnique();

    @Test
    public void stringHasUniqueCharacters(){
        assertEquals(true, isUnique.stringIsUnique("Today"));
        assertEquals(false, isUnique.stringIsUnique("Tomorrow"));
    }
}
