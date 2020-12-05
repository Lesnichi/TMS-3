import java.util.Random;

public class RunClassWork3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        int sumOfEvenNumber = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumOfEvenNumber++;
            }
        }
        System.out.println();
        System.out.println(sumOfEvenNumber);

    }
}

