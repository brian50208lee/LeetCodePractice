package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P208_ImplementTrieTest {
    @Test
    public void testTrie() {
        P208_ImplementTrie trie = new P208_ImplementTrie();
        trie.insert("apple");
        Assert.assertTrue(trie.search("apple"));   // returns true
        Assert.assertFalse(trie.search("app"));     // returns false
        Assert.assertTrue(trie.startsWith("app")); // returns true
        trie.insert("app");
        Assert.assertTrue(trie.search("app"));     // returns true
    }
}