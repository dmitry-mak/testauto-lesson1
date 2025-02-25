package ru.netology.autobasics;


import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest  {

    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
         int actual = cashbackHackService.remain(900);
         int expected = 100;
         assertEquals(expected, actual);
    }

    @Test
    public void shouldCountForLowerBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountForUpperBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1001);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroForAmountEqualBoundary(){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroForAmountZero(){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(0);
        int expected = 0;
        assertEquals(expected, actual);
    }

}