import java.util.Scanner;

public class FinalTask_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current exchange rate of the ruble to the dollar");
        double rate = sc.nextDouble();
        System.out.println("Current exchange rate: " + rate + " $/\u20BD");

        System.out.println("Enter the number of rubles to convert to dollar");
        double rub = sc.nextDouble();

        System.out.printf("At the current rate for " + rub + " rubles, you will receive %.2f$ without commission", rub * rate);
    }
}