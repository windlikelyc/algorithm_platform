package answers.lyc;

import problems.easy.UniqueMorseCodeWords;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodeWordsImpl implements UniqueMorseCodeWords{
    public int uniqueMorseRepresentations(String[] words) {
        String[] strings = new String[]
                {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map chamap = new HashMap(26);
        for(int i = 0 ; i < 26;i++) {
            chamap.put((char) ('a' + i), strings[i]);
        }
        Set set = new HashSet();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(chamap.get(c));
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
