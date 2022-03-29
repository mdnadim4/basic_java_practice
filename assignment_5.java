import java.util.Scanner;

public class assignment_5 {

    public static void main(String[] args) {
        System.out.print("Enter the number: ");

        int number = 0;
        int lastDigit = 0;
        int sum = 0;

        Scanner num = new Scanner(System.in);
        number = num.nextInt();
        while (number > 0) {
            lastDigit = number % 10;
            sum = sum + lastDigit;
            number = number / 10;
        }

        System.out.println("Sum of Digits: " + sum);
    }

}
