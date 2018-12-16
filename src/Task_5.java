import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter binary: ");
        String bin = scanner.nextLine();

        System.out.println("In decimal - " + Integer.parseInt(bin, 2));
    }
}
