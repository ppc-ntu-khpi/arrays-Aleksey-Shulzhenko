package test;

import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        int total = 50000;
        int badPlates = Exercise.countBadPlates(total);
        System.out.println("Кількість помилкових табличок: " + badPlates);
    }
}
