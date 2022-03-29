import java.util.Scanner;

public class assignment_2 {

    public static void main(String[] args) {

        int shirtPrice = 1200;
        int shareePrice = 3500;
        int doubleShirt = shirtPrice * 2;
        int purchasePriceWithDiscount = (shirtPrice + shareePrice) - 400;
        int purchasePriceWithoutDiscount = shirtPrice + shareePrice;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter price of Shirt:");
        shirtPrice = sc.nextInt();

        System.out.println("Enter price of Sharee:");
        shareePrice = sc.nextInt();

        if (shirtPrice == doubleShirt && shareePrice == 3500) {
            System.out.println("Total purchase cost with Discount: " + purchasePriceWithDiscount);
        } else {
            System.out.println("Total purchase cost without Discount: " + purchasePriceWithoutDiscount);

        }
    }

}
