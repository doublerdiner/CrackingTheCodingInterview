package Chapter1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class URLifyTest {
    URLify urlify = new URLify();

    @Test
    public void replaceSpacesTest(){
        String test = "Hi my name is Chris";
        String answer = "Hi%20my%20name%20is%20Chris";
        assertEquals(answer, urlify.replaceSpaces(test));
    }
}
