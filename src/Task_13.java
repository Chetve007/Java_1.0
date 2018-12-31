import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        String S = scanner.nextLine();

        int X = Integer.parseInt(S);

        double Y = X;

        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);
    }
}
