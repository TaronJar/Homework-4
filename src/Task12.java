import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Задание: 12");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: x ");
        double x = scanner.nextDouble();
        System.out.print("Введите число: y ");
        double y = scanner.nextDouble();
        int days = 0;
        double dist = 0;
        while (dist < y) {
            dist += x;
            x *= 1.1;
            days++;
        }
        System.out.println(days + " days");
    }
}
