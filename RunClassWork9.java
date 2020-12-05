import java.util.Random;
import java.util.Scanner;

public class RunClassWork9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;

        int size;
        do {
            System.out.println("Введите размер массива: ");
            size = scanner.nextInt();
            if (size <= 0 || size % 2 != 0) {
                System.out.println("Вы ввели неверное значение (размер  массива должен быть четным");
            }
        } while (size <= 0 || size % 2 != 0);


        int[] array = new int[size];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }

        System.out.println("Array");
        for (int i : array) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < array.length / 2; i++) {
            sum1 = sum1 + array[i];
        }
        for (int i = array.length / 2; i < array.length; i++) {
            sum2 = sum2 + array[i];
        }
        System.out.println();
        if (sum1 > sum2) {
            System.out.println("Левая половина массива больше");
        } else if (sum2 > sum1) {
            System.out.println("Правая половина массива больше");
        } else if (sum1 == sum2) {
            System.out.println("Левая и правая половины массива равны");
        }
    }
}
