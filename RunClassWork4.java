import java.util.Random;

public class RunClassWork4 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }

        System.out.println();
        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}
