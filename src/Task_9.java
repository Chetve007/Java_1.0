import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        int count = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please fill matrix " + matrix.length + " by " + matrix[matrix.length-1].length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[matrix.length-1].length; j++) {
                System.out.print("Number " + count++ + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.print("The first row in the matrix multiplied by '3': ");
        for (int i = 0; i < matrix[matrix.length-1].length; i++)
            System.out.print(matrix[0][i] * 3 + " ");
    }
}
