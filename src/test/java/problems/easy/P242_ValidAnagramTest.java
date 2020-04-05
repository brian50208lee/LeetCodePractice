package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P242_ValidAnagramTest {
    @Test
    public void testIsAnagram() {
        P242_ValidAnagram p242 = new P242_ValidAnagram();
        Assert.assertTrue(p242.isAnagram("anagram", "nagaram"));
    }

    @Test
    public void testIsAnagram2() {
        P242_ValidAnagram p242 = new P242_ValidAnagram();
        Assert.assertFalse(p242.isAnagram("rat", "car"));
    }
}