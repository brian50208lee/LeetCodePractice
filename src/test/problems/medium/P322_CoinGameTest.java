package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P322_CoinGameTest {
    @Test
    public void testCoinGame() {
        // given
        P322_CoinGame p322 = new P322_CoinGame();
        Assert.assertEquals(3, p322.coinChange(new int[]{1,2,5}, 11));
    }

    @Test
    public void testCoinGame2() {
        // given
        P322_CoinGame p322 = new P322_CoinGame();
        Assert.assertEquals(-1, p322.coinChange(new int[]{2}, 3));
    }


    @Test
    public void testCoinGame3() {
        // given
        P322_CoinGame p322 = new P322_CoinGame();
        Assert.assertEquals(20, p322.coinChange(new int[]{186,419,83,408}, 6249));
    }

    @Test
    public void testCoinGame4() {
        // given
        P322_CoinGame p322 = new P322_CoinGame();
        Assert.assertEquals(0, p322.coinChange(new int[]{1}, 0));
    }
}