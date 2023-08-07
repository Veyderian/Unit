package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test   //1

    public void shouldRequiredAmountJunit4() {

        CashbackHackService hackService = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = hackService.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test  //2 граничное значение 999
    public void shouldRequiredAmount1Junit4() {

        CashbackHackService hackService = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = hackService.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test //3 граничное значение 1000
    public void shouldRequiredAmount0Junit4() {

        CashbackHackService hackService = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = hackService.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test //4 граничное значение 1001
    public void shouldRequiredAmount999Junit4() {

        CashbackHackService hackService = new CashbackHackService();
        int amount = 1_001;

        int expected = 999;
        int actual = hackService.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test   //1

    public void shouldRequiredAmountApi() {

        CashbackHackService hackService = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = hackService.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test  //2 граничное значение 999
    public void shouldRequiredAmount1Api() {

        CashbackHackService hackService = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = hackService.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test //3 граничное значение 1000
    public void shouldRequiredAmount0Api() {

        CashbackHackService hackService = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = hackService.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test //4 граничное значение 1001
    public void shouldRequiredAmount999Api() {

        CashbackHackService hackService = new CashbackHackService();
        int amount = 1_001;

        int expected = 999;
        int actual = hackService.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
}