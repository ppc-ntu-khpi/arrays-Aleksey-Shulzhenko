package domain;

public class Exercise {
    // Метод для підрахунку кількості помилкових табличок
    public static int countBadPlates(int max) {
        int count = 0;
        for (int i = 0; i < max; i++) {
            if (String.valueOf(i).contains("2")) {
                count++;
            }
        }
        return count;
    }
}
