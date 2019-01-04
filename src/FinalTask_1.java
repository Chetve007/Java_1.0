import java.util.Scanner;

public class FinalTask_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 9");
        int number = scanner.nextInt();

        switch (number) {
            case 0:
                throw new ArithmeticException("Any number multiplied by 0 will be 0");
            case 1:
                multiply(number);
                break;
            case 2:
                multiply(number);
                break;
            case 3:
                multiply(number);
                break;
            case 4:
                multiply(number);
                break;
            case 5:
                multiply(number);
                break;
            case 6:
                multiply(number);
                break;
            case 7:
                multiply(number);
                break;
            case 8:
                multiply(number);
                break;
            case 9:
                multiply(number);
                break;
            default:
                throw new RuntimeException("We asked you in English to enter any number from 1 to 9, but not this shit.");
        }
    }

    private static void multiply(int num) {
        for (int i = 1; i <= 10; i++)
            System.out.println(num + " * " + i + " = " + num * i);
    }
}
