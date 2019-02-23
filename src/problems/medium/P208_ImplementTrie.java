package problems.medium;

import java.util.HashMap;
import java.util.Map;

public class P208_ImplementTrie {
    private boolean isEnd;

    public void setEnd(boolean end) {
        isEnd = end;
    }

    public boolean isEnd() {
        return isEnd;
    }

    private Map<Character, P208_ImplementTrie> childs;

    /**
     * Initialize your data structure here.
     */
    public P208_ImplementTrie() {
        isEnd = false;
        childs = new HashMap<>();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        if (word.isEmpty()) {
            setEnd(true);
        } else {
            char firstChar = word.charAt(0);
            if (!childs.containsKey(firstChar)) {
                childs.put(firstChar, new P208_ImplementTrie());

            }
            childs.get(firstChar).insert(word.substring(1, word.length()));
        }
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        if (word.isEmpty()) {
            return isEnd();
        } else {
            char firstChar = word.charAt(0);
            if (!childs.containsKey(firstChar)) {
                return false;
            } else {
                return childs.get(firstChar).search(word.substring(1, word.length()));
            }
        }
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        if (prefix.isEmpty()) {
            return true;
        } else {
            char firstChar = prefix.charAt(0);
            if (!childs.containsKey(firstChar)) {
                return false;
            } else {
                return childs.get(firstChar).startsWith(prefix.substring(1, prefix.length()));
            }
        }
    }
}
