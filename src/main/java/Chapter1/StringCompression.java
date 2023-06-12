package Chapter1;

public class StringCompression {
    public String compressString(String testString) {
        char[] charArray = testString.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int charCount = 0;
        for(int i=0; i<charArray.length; i++){
            charCount++;
            char currentChar = charArray[i];
            if(i+1 >= charArray.length || currentChar != charArray[i+1]) {
                stringBuilder.append(currentChar);
                stringBuilder.append(charCount);
                charCount=0;
            }
        }
        return testString.length() > stringBuilder.length() ? stringBuilder.toString() : testString;
    }
}
