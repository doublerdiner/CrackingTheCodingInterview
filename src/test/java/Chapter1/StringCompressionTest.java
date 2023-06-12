package Chapter1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCompressionTest {

    StringCompression stringCompression = new StringCompression();

    @Test
    public void stringCompressionTestPassesAsExpected(){
        String testString = "aabbcddccbbba";
        String testString2 = "aaaaaaaaaabbc";
        assertEquals("aabbcddccbbba", stringCompression.compressString(testString));
        assertEquals("a10b2c1", stringCompression.compressString(testString2));
    }
}
