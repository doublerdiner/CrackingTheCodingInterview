package Chapter1;

public class URLify {
    public String replaceSpaces(String sentence) {
        char[] charArray = sentence.toCharArray();
        StringBuilder answer = new StringBuilder();
        for(char letter : charArray){
            if(letter == ' '){
                answer.append('%');
                answer.append('2');
                answer.append('0');
            }
            else{
                answer.append(letter);
            }
        }
        return answer.toString();
    }
}
