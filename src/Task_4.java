import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter three integers");

        System.out.print("First: ");
        int x = scanner.nextInt();

        System.out.print("Second: ");
        int y = scanner.nextInt();

        System.out.print("Third: ");
        int z = scanner.nextInt();

        double avg = (double) (x + y + z) / 3;
        System.out.println("Arithmetic is: " + avg);
        System.out.println("Arithmetic divide by 2: " + (int)(avg / 2));
        System.out.println(avg / 2 > 3 ? "Программа выполнена корректно" : "");
    }
}
