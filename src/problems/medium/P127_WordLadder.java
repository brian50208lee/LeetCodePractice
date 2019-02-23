package problems.medium;

import java.util.*;

// TODO not AC, TLE. Due to the DFS, try use BFS
public class P127_WordLadder {
    private static final int CAN_NOT_TRANSFER = 0;

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        wordSet.remove(beginWord);

        if (!wordSet.contains(endWord)) {
            return CAN_NOT_TRANSFER;
        }

        return bfs(beginWord, endWord, wordSet);
    }

    private int bfs(String beginWord, String endWord, Set<String> wordSet) {
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord); // first level
        int level = 1;

        while (!queue.isEmpty()) {
            Queue<String> nextQueue = new LinkedList<>();

            for (String word : queue) {
                if (word.equals(endWord)) {
                    return level;
                }
                List<String> nextLevelWords = generateNextLevelWords(word, wordSet);
                //System.out.println("level = " + level);
                //System.out.println("nextLevelWords = " + nextLevelWords);
                for (String nextLevelWord : nextLevelWords) {
                    wordSet.remove(nextLevelWord);
                    nextQueue.add(nextLevelWord);
                }
            }

            queue = nextQueue;
            level++;
        }

        return CAN_NOT_TRANSFER;
    }

    private List<String> generateNextLevelWords(String word, Set<String> wordSet) {
        List<String> results = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char[] nextWordChars = word.toCharArray();
            for (char c = 'a'; c <= 'z'; c++) {
                nextWordChars[i] = c;
                String nextWord = new String(nextWordChars);
                if (wordSet.contains(nextWord)) {
                    results.add(nextWord);
                }
            }
        }
        return results;
    }
}
