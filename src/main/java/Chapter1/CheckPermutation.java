package Chapter1;

import java.util.Arrays;

public class CheckPermutation {
    public boolean permutationChecker(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        char[] formattedWord1 = formatWord(word1);
        char[] formattedWord2 = formatWord(word2);

        for(int i=0; i<formattedWord1.length; i++){
            if(formattedWord1[i] != formattedWord2[i]){
                return false;
            }
        }
        return true;
    }

    public char[] formatWord(String word){
        String wordLower = word.toLowerCase().strip();
        char[] wordChar = wordLower.toCharArray();
        Arrays.sort(wordChar);
        return wordChar;
    }
}
