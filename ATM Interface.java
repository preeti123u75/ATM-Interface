import java.util.*;

public class Atmmachine {
    public static void main(String[] args) {
        int balance = 100000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("____________||welcome to Simplified learner ATM ||___________");
            System.out.println("choose 1 for Withdraw");
            System.out.println("choofse 2 for deposit");
            System.out.println("choose 3 for cheack balance");
            System.out.println("choose 4 for Exit");
            System.out.print("choose the operation you want to perform: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter money to be withdraw : ");

                    withdraw = sc.nextInt();

                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("please collect your amount.");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Enter money to deposited");
                    deposit = sc.nextInt();

                    balance = balance + deposit;
                    System.out.println("your money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("balance : " + balance);
                    System.out.println();
                    break;

                case 4:
                    System.exit(0);
            }
        }

    }

}
