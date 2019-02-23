package problems.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P127_WordLadderTest {
    @Test
    public void test() {
        // given
        P127_WordLadder p127 = new P127_WordLadder();
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
        int expected = 5;
        //when

        //then
        Assert.assertEquals(expected, p127.ladderLength(beginWord, endWord, wordList));
    }

    @Test
    public void test2() {
        // given
        P127_WordLadder p127 = new P127_WordLadder();
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log");
        int expected = 0;
        //when

        //then
        Assert.assertEquals(expected, p127.ladderLength(beginWord, endWord, wordList));
    }

    @Test
    public void test3() {
        // given
        P127_WordLadder p127 = new P127_WordLadder();
        String beginWord = "hot";
        String endWord = "dog";
        List<String> wordList = Arrays.asList("hot","cog","dog","tot","hog","hop","pot","dot");
        int expected = 3;
        //when

        //then
        Assert.assertEquals(expected, p127.ladderLength(beginWord, endWord, wordList));
    }
}