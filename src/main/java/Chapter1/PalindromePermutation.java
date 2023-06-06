package Chapter1;

import java.util.Arrays;
import java.util.HashMap;

public class PalindromePermutation {
    public boolean permutationOfAPalindrome(String phrase) {
        HashMap<Character, Integer> mapOfLetters = new HashMap<>();
        String formatted = phrase.toLowerCase().strip();
        char[] charArray = formatted.toCharArray();
        int spaces = 0;
        for(int i=0; i<charArray.length; i++){
            char currentLetter = charArray[i];
            if(currentLetter == ' '){
                spaces++;
                continue;
            }
            else if(mapOfLetters.containsKey(currentLetter)){
                    int value = mapOfLetters.get(currentLetter)+1;
                    mapOfLetters.put(currentLetter, value);
                    continue;
                }
            mapOfLetters.put(currentLetter, 1);
            }
        int arrayLength = charArray.length - spaces;
        return characterCheck(arrayLength, mapOfLetters);
    }

    private boolean characterCheck(int arrayLength, HashMap<Character, Integer> hashMap) {
        System.out.println(arrayLength);
        System.out.println(hashMap);
        boolean oddFound = false;
        for(char letter: hashMap.keySet()){
            if(hashMap.get(letter) % 2 != 0 && oddFound){
                return false;
            }
            else if(hashMap.get(letter) % 2 != 0){
                oddFound = true;
            }
        }
        return true;
    }
}
