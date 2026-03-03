package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100IfAmountIs900() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn500IfAmountIs500() {
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn300IfAmountIs1700() {
        int amount = 1700;
        int expected = 300;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }
}
