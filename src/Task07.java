public class Task07 {
    public static void main(String[] args) {
      System.out.println("Задание: 7");
int num = 5;
for (int i = 31; i >= 0; i--) {
    int bit = (num >> i) & 1;
    System.out.println(bit);
}

    }
}
