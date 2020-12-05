public class RunClassWork1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int j = 0;

        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                array[j++] = i;
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : array) {
            System.out.println(i);
        }
    }
}
