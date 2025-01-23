package com.uu2.ch14;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QA103Test {

    private QA103 qa103;

    @BeforeEach
    public void setUp() {
        qa103 = new QA103();
    }

    @Test
    public void coinChange_AmountZero_ReturnsZero() {
        int[] coins = {1, 2, 5};
        int amount = 0;
        int result = qa103.coinChange(coins, amount);
        assertEquals(0, result);
    }

    @Test
    public void coinChange_NoSolution_ReturnsMinusOne() {
        int[] coins = {2};
        int amount = 3;
        int result = qa103.coinChange(coins, amount);
        assertEquals(-1, result);
    }

    @Test
    public void coinChange_SingleCoin_ReturnsOne() {
        int[] coins = {1, 2, 5};
        int amount = 5;
        int result = qa103.coinChange(coins, amount);
        assertEquals(1, result);
    }

    @Test
    public void coinChange_MultipleCoins_ReturnsMinimumCoins() {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = qa103.coinChange(coins, amount);
        assertEquals(3, result); // 5 + 5 + 1
    }

    @Test
    public void coinChange_ComplexCase_ReturnsMinimumCoins() {
        int[] coins = {186, 419, 83, 408};
        int amount = 6249;
        int result = qa103.coinChange(coins, amount);
        assertEquals(20, result);
    }
}
