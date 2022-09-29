package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalc() {
        SQRService sqrService = new SQRService();
        int expected = 3;
        int actual = sqrService.calculateSQR(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalc1() {
        SQRService sqrService = new SQRService();
        int expected = 5;
        int actual = sqrService.calculateSQR(100, 200);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalc2() {
        SQRService sqrService = new SQRService();
        int expected = 11;
        int actual = sqrService.calculateSQR(6400, 8100);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalc3() {
        SQRService sqrService = new SQRService();
        int expected = 81;
        int actual = sqrService.calculateSQR(100, 8100);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalc4() {
        SQRService sqrService = new SQRService();
        int expected = 1;
        int actual = sqrService.calculateSQR(100, 100);
        Assertions.assertEquals(expected, actual);
    }
}