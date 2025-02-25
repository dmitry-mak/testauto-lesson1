package ru.netology.autobasics;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCountForLowerBoundaryValue() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

//    Должен возвращать 0 если сумма покупки равна граничному значению (int boundary)
    @Test
    public void shouldReturnZeroIfAmountEqualsBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }


    @Test
    public void shouldCountForUpperBoundaryValue() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);
    }

//    Должен возвращать 0 если сумма покупки равна 0
    @Test
    public void shouldReturnZeroIfAmountIsZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(0);
        int expected = 0;
        assertEquals(actual, expected);
    }
}