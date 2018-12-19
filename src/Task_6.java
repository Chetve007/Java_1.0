import java.util.Scanner;

public class Task_6 {

    private static final int X = 3;
    private static final int Y = 7;
    private static final int Z = 9;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int T = scanner.nextInt();

        switch (T) {
            case X:
                System.out.println("Данное значение имеется в константах T = X");
                break;
            case Y:
                System.out.println("Данное значение имеется в константах T = Y");
                break;
            case Z:
                System.out.println("Данное значение имеется в константах T = Z");
                break;
            default:
                System.out.println("Такой константы нет!");
        }
    }
}
