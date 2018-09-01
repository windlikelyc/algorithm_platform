package answers.lyc;

import problems.easy.ToLowerCase;

public class ToLowerCaseImpl implements ToLowerCase {
    public String toLowerCase(String str) {
        int delta = 'A' - 'a';
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c - delta));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
