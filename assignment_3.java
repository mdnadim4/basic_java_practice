import java.util.Scanner;

public class assignment_3 {

    static void print(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {

        int price;
        int discount;
        int purchasePrice;

        Scanner sc = new Scanner(System.in);

        print("Enter price of Laptop:");
        price = sc.nextInt();

        print("Enter Discount Rate:");
        discount = sc.nextInt();

        purchasePrice = (price * discount) / 100;

        print("Product purchase price is " + purchasePrice);
    }

}
