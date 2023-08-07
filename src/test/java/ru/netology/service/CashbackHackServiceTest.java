package ru.netology.service;


import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test //1
    public void shouldRequiredAmount() {

        CashbackHackService hackService = new CashbackHackService();

        int amount = 900;

        int expected = 100;
        int actual = hackService.remain(amount);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test//2 граничное значение 999
    public void shouldRequiredAmount1() {

        CashbackHackService hackService = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = hackService.remain(amount);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test //3 граничное значение 1000
    public void shouldRequiredAmount0() {

        CashbackHackService hackService = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = hackService.remain(amount);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test //4 граничное значение 1001
    public void shouldRequiredAmount999() {

        CashbackHackService hackService = new CashbackHackService();
        int amount = 1_001;

        int expected = 999;
        int actual = hackService.remain(amount);

        assertEquals(actual, expected);
    }
}