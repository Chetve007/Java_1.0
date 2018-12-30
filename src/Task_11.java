import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any line: ");

        String line = scanner.nextLine()
                .replaceAll(" ", "")
                .trim();

        System.out.println(line);
    }
}
