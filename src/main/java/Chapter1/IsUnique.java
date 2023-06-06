package Chapter1;

import java.util.HashMap;

public class IsUnique {

    public boolean stringIsUnique(String word) {
        char[] chars = word.toCharArray();
        HashMap<Character, Integer> mapOfWord = new HashMap<>();
        for(int i=0; i<chars.length; i++){
            char currentLetter = chars[i];
            if(mapOfWord.containsKey(currentLetter)){
                return false;
            }
            else{
                mapOfWord.put(currentLetter, 1);
            }
        }
        return true;
    }
}
