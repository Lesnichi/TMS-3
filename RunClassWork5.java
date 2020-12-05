import java.util.Arrays;
import java.util.Random;

public class RunClassWork5 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        double firstAVG = 0;
        double secondAVG = 0;

        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(20);
        }
        System.out.println(" Array #1");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(20);
        }
        System.out.println(" Array #2");

        for (int i : array2) {
            System.out.print(i + " ");
        }
        for (int i : array1) {
            firstAVG += i;
        }
        for (int i : array2) {
            secondAVG += i;
        }
        System.out.println();
        System.out.println("Среднее арифметическое значение элементов масива #1 = " + firstAVG/ array1.length);
        System.out.println("Среднее арифметическое значение элементов масива #2 = " + secondAVG/ array2.length);
    }
}
