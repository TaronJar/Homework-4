public class Task11 {
    public static void main(String[] args) {
        System.out.println("Задание: 11");

        for (int i = 1; i <= 1000; i++) {
            String n = Integer.toString(i);
            String f = "";
            String b = "";
            String h = "";
            if (i % 15 == 0) {
                System.out.println(h + "hiss");
            }
            if (i % 3 == 0) {
                System.out.println(f + "fizz");
            }
            if (i % 5 == 0) {
                System.out.println(b + "buzz");
            }
            System.out.println(i + f + b + h);
        }
    }
}