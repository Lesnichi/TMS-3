import java.util.Random;

public class RunClassWork6 {
    public static void main(String[] args) {
        int[] array = new int[4];
        boolean isIncreasingSequence = true;

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                continue;
            } else {
                isIncreasingSequence = false;
                break;
            }
        }
        System.out.println();
        if (isIncreasingSequence) {
            System.out.println("It's increasing sequence");
        } else {
            System.out.println("It isn't increasing sequence");
        }
    }
}
