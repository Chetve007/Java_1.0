import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        int[] mass = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please fill in an array consisting of " + mass.length + " elements");

        for (int i = 0; i < mass.length; i++) {
            System.out.print("Enter " + (i+1) + " number: ");
            mass[i] = scanner.nextInt();
        }

        System.out.println("Array is full");

        for (int i : mass)
            System.out.print(i * 2 + " ");
    }
}
