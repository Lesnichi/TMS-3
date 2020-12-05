public class RunClassWork2 {
    public static void main(String[] args) {
        int[] array = new int[50];
        int j = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                array[j] = i;
                j++;
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();


        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
