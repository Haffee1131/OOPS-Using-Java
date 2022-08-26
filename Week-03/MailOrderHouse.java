// MAIL ORDER HOUSE PROGRAM

import java.util.*;

public class MailOrderHouse {

    int productId;
    String productName;
    int productQuantity;
    double productPrice;

    public void input(int id, String name, int quantity, double price) {

        productId = id;
        productName = name;
        productQuantity = quantity;
        productPrice = price;

    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner scan = new Scanner(System.in);

        MailOrderHouse products[] = new MailOrderHouse[6];

        for (int i = 1; i < 6; i++) {
            products[i] = new MailOrderHouse();
        }

        products[1].input(11, "p1", 10, 99.90);
        products[2].input(12, "p2", 8, 20.20);
        products[3].input(13, "p3", 3, 6.87);
        products[4].input(14, "p4", 15, 45.50);
        products[5].input(15, "p5", 5, 40.49);

        // printing products
        System.out.println("ID \t NAME \t QUANTITY \t PRICE\n");
        for (int i = 1; i < 6; i++) {
            System.out.println(products[i].productId + "\t" + products[i].productName + "\t"
                    + products[i].productQuantity + "\t\t" + products[i].productPrice);
        }

        double totalBill = 0;
        while (true) {
            System.out.println("0.exit  1. continue shopping  2.print bill  3.Menu\n");

            System.out.print("Option: ");
            int opt = scan.nextInt();

            switch (opt) {
                case 0:
                    System.out.println("Bye!");
                    System.exit(0);
                case 1:

                    System.out.print("Buying Product ID: ");
                    int inputId = scan.nextInt();

                    int inputIdFound = 0;
                    for (int i = 1; i < 6; i++) {
                        if (products[i].productId == inputId) {
                            inputIdFound = 1;

                            System.out.print("Buying Product Quantity: ");
                            int inputQuantity = scan.nextInt();

                            if (products[i].productQuantity >= inputQuantity) {
                                totalBill += (inputQuantity * products[i].productPrice); // calculating bill

                                products[i].productQuantity -= inputQuantity; // subtracting product quantity
                            } else {
                                System.out.println("Quantity out of range");
                            }
                        }
                    }
                    if (inputIdFound == 0) {
                        System.out.println("Product Id not found.. Try with correct ID");
                    }

                    break;

                case 2:
                    System.out.println("\nYour Bill: " + totalBill + "\n");
                    break;

                case 3:
                    System.out.println("ID \t NAME \t QUANTITY \t PRICE\n");
                    for (int i = 1; i < 6; i++) {
                        System.out.println(products[i].productId + "\t" + products[i].productName + "\t"
                                + products[i].productQuantity + "\t\t" + products[i].productPrice);
                    }
                    break;

                default:
                    System.out.println("Choose Wise");
                    break;
            }
        }
    }
}
