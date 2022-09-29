package ru.netology.sqr;

public class SQRService {
    public int calculateSQR(int x, int y) {
        int master = 0;
        for (int i = 10; i <= 90; i++) {
            if (i * i >= x) {
                if (i * i <= y) {
                    master++;
                }
            }
        }
        return master;
    }
}

