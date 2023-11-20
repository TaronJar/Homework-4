public class Task08 {
    public static void main(String[] args) {
        System.out.println("Задание: 8");
        int b = 0;
        for (int h = 1; h <= 24; h++) {
            for (int m = 0; m < 59; m++) {
                if (h / 10 % 10 == m % 10 & h % 10 == m / 10 % 10) {
                    b++;
                }

            }
        }
        System.out.println("Всего " + b + " совпадений!");
    }
}
