import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, n, count;
        int[] array = new int[10];
        int reminder = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        n = scanner.nextInt();
        for (i = 1; n > 0; i++) {
            reminder = n % 2;
            array[i] = reminder;
            n = n / 2;
            count = i;
        }
        for (i = count; i > 0; i--) {
            System.out.println("binary number is " + array[i]);
        }
    }
}