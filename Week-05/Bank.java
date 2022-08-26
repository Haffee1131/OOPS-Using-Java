// ACCOUNT DETAILS, CREDIT, DEBIT PROGRAM

import java.util.*;

public class Bank {
    public static void main(String[] args) {

        // creating scanner object
        Scanner scan = new Scanner(System.in);

        int noOfAccounts = 2;
        Account accounts[] = new Account[noOfAccounts];

        accounts[0] = new Account();
        accounts[0].input("Hafeez", 1, 100000, "New York");

        accounts[1] = new Account();
        accounts[1].input("Azeez", 2, 200000, "New Delhi");

        while (true) {
            System.out.println("0.exit  1.details  2.credit  3.debit");

            System.out.print("Option: ");
            int opt = scan.nextInt();

            switch (opt) {
                case 0:
                    System.out.println("Bye!");
                    System.exit(0);

                case 1:
                    System.out.print("Account Number: ");
                    int inputAccountNumber = scan.nextInt();

                    int accountNumberFound = 0;
                    for (int i = 0; i < noOfAccounts; i++) {
                        if (inputAccountNumber == accounts[i].accountNumber) {
                            accountNumberFound = 1;
                            accounts[i].output();
                        }
                    }
                    if (accountNumberFound == 0) {
                        System.out.println("Account Number Doesn't Exist.");
                    }
                    break;

                case 2:

                    System.out.print("Account Number: ");
                    inputAccountNumber = scan.nextInt();

                    accountNumberFound = 0;
                    for (int i = 0; i < noOfAccounts; i++) {
                        if (inputAccountNumber == accounts[i].accountNumber) {
                            accountNumberFound = 1;

                            System.out.print("Amount to Credit: ");
                            double creditAmount = scan.nextDouble();
                            accounts[i].accountBalance += creditAmount;

                            System.out.println("Amount Credited: " + creditAmount);
                        }
                    }
                    if (accountNumberFound == 0) {
                        System.out.println("Account Number Doesn't Exist.");
                    }
                    break;

                case 3:

                    System.out.print("Account Number: ");
                    inputAccountNumber = scan.nextInt();

                    accountNumberFound = 0;
                    for (int i = 0; i < noOfAccounts; i++) {
                        if (inputAccountNumber == accounts[i].accountNumber) {
                            accountNumberFound = 1;

                            System.out.print("Amount to Debit: ");
                            double debitAmount = scan.nextDouble();
                            if (debitAmount >= accounts[i].accountBalance) {
                                System.out.println("Insufficient Balance");
                                break;
                            }
                            accounts[i].accountBalance -= debitAmount;

                            System.out.println("Amount Debited: " + debitAmount);
                        }
                    }
                    if (accountNumberFound == 0) {
                        System.out.println("Account Number Doesn't Exist.");
                    }
                    break;

                default:
                    System.out.println("Choose Wise!");
                    break;
            }
        }
    }
}

class Account {
    String accountName;
    int accountNumber;
    double accountBalance = 100000;
    String accountAddress;

    void input(String name, int number, double balance, String address) {
        accountName = name;
        accountNumber = number;
        accountBalance = balance;
        accountAddress = address;
    }

    void output() {

        System.out.println("Name: " + accountName);
        System.out.println("Number: " + accountNumber);
        System.out.println("Balance: " + accountBalance);
        System.out.println("Address: " + accountAddress);
    }
}
