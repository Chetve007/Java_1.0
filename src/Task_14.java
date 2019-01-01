import java.util.Arrays;

public class Task_14 {
    public static void main(String[] args) {

        int[] mass = new int[12];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println("Unsorted array: " + Arrays.toString(mass));

        bubbleSort(mass);

        System.out.println("Sorted array (bubble sort): " + Arrays.toString(mass));
    }

    private static void bubbleSort(int[] mass) {
        for (int i = mass.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] > mass[j+1]) {
                    int temp = mass[j];
                    mass[j] = mass[j+1];
                    mass[j+1] = temp;
                }
            }
        }
    }
}
