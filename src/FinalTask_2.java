import java.util.Arrays;
import java.util.Scanner;

public class FinalTask_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter any integers into an array of the specified size by you");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            System.out.println("You entered the " + (i+1) + " number into an array of size " + array.length);
        }

        System.out.println("\nYou fill the array with the following numbers: " + Arrays.toString(array));

        arrayToSort(array);

        System.out.println("Your array is sorted in ascending order: " + Arrays.toString(array));
    }

    private static void arrayToSort(int[] array) {
        int el;
        int index;
        for (int i = 0; i < array.length; i++) {
            el = array[i];
            index = i;

            while (index > 0 && array[index-1] > el) {
                array[index] = array[index-1];
                index--;
                array[index] = el;
            }
        }
    }
}
