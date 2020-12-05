import java.util.Random;

public class RunClassWork7 {
    public static void main(String[] args) {
        int[] array = new int[12];
        int indexOfMaxElement = 0;
        int temp = 0;

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (temp <= array[i]) {
                indexOfMaxElement = i;
                temp = array[i];
            }
        }
        System.out.println("Index of MAX element = " + indexOfMaxElement);
    }
}
