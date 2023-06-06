package Chapter1;

import java.util.Arrays;

public class OneAway {
    public boolean checkIfStringIsOneEditAway(String word1, String word2) {
        char[] word1CharArray = formatWordToCharArray(word1);
        char[] word2CharArray = formatWordToCharArray(word2);
        if(word1CharArray.length == word2CharArray.length){
            return checkIfEqualCharArrayLengthAreOneEditAway(word1CharArray, word2CharArray);
        }
        else if(word1CharArray.length + 1 == word2CharArray.length){
            return checkIfUnequalCharArrayLengthHaveEdit(word2CharArray, word1CharArray);
        }
        else if(word1CharArray.length - 1 == word2CharArray.length){
            return checkIfUnequalCharArrayLengthHaveEdit(word1CharArray, word2CharArray);
        }
        return false;
    }

    private boolean checkIfUnequalCharArrayLengthHaveEdit(char[] longerArray, char[] shorterArray) {
        boolean differenceFound = false;
        int longerIndex = 0;
        int shorterIndex = 0;
        while(longerIndex < longerArray.length && shorterIndex < shorterArray.length){
            if(longerArray[longerIndex] != shorterArray[shorterIndex] && differenceFound){
                return false;
            }
            else if(longerArray[longerIndex] != shorterArray[shorterIndex] ){
                differenceFound = true;
                longerIndex++;
                continue;
            }
            longerIndex++;
            shorterIndex++;
        }
        return true;
    }

    private boolean checkIfEqualCharArrayLengthAreOneEditAway(char[] word1CharArray, char[] word2CharArray) {
        boolean differenceFound = false;
        for(int i=0; i<word1CharArray.length; i++){
            if(differenceFound && word1CharArray[i] != word2CharArray[i]){
                return false;
            }
            else if(word1CharArray[i] != word2CharArray[i]){
                differenceFound = true;
            }
        }
        return true;
    }

    private char[] formatWordToCharArray(String word) {
        String wordFormatted = word.toLowerCase().strip();
        char[] charArray = wordFormatted.toCharArray();
        return charArray;
    }
}
