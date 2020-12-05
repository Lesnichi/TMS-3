import java.util.Random;

public class RunClassWork8 {

    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];
        int counterOfInteger = 0;

        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(10);
        }
        System.out.println("Array #1");
        for (int i : array1) {
            System.out.print(i + " ");

        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(10) + 1;
        }
        System.out.println("Array #2");
        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Array #3");
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (double) array1[i] / (double) array2[i];
        }
        for (double v : array3) {
            System.out.print(v + "  ");
        }

        System.out.println();
        for (double v : array3) {
            if (v % 1 == 0) {
                counterOfInteger++;
            }
        }
        System.out.println("Количество целых чисел в Array#3 = " + counterOfInteger);
    }
}
