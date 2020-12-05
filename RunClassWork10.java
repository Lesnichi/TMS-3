import java.util.Random;
import java.util.Scanner;

public class RunClassWork10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 3) {
            System.out.println("Вы ввели число меньшее чем 3");
            System.out.println("Перезапустите программу с корректными данными");
            System.exit(0);
        }

        int[] array1 = new int[n];
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(n);
        }
        System.out.println("Array#1");
        for (int i : array1) {
            System.out.print(i + " ");
        }

        int size = 0;
        for (int i : array1) {
            if (i % 2 == 0 && i != 0) {
                size++;
            }
        }
        int[] array2 = new int[size];
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0 && array1[i] != 0) {
                array2[j] = array1[i];
                j++;
            }
        }
        System.out.println();
        System.out.println("Array#2");
        for (int i : array2) {
            System.out.print(i + " ");
        }
    }
}
