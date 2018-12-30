import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first line: ");
        String first = scanner.nextLine();

        System.out.println("Enter second line: ");
        String second = scanner.nextLine();

        System.out.println(first.length() > second.length() ? first : second);
    }
}
