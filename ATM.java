import java.util.Scanner;

public class ATM {


    public static void main(String[] args) {

        String userName, password;
        int right = 3, secim;
        double balance = 1500, yatirma, cekim;
        Scanner input = new Scanner(System.in);


        while (right > 0) {

            System.out.println("Username : ");
            userName = input.nextLine();
            System.out.println("Password: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("You are logged into the system.");
                System.out.println("Please wait.....");
                break;

            } else {
                right--;
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact your bank");
                    break;
                } else {
                    System.out.println("Incorrect username or password. Try again.");
                    System.out.println("Your remaining right: " + +right);
                }

            }
        }

        System.out.println("Hello and welcome to X Bank.Please Key In The Option You Want To Make:\n1-Deposit\n2-Withdraw\n3-Balance Inquiry\n4-Log Out");
        secim = input.nextInt();
        switch (secim) {
            case 1: {
                System.out.println("Please enter the amount you want to deposit: ");
                yatirma = input.nextDouble();
                balance += yatirma;
                System.out.println("Your money is being deposited, please wait...");
                System.out.println("Deposit completed, your new balance: " + balance);
                break;
            }

            case 2: {
                System.out.println("Enter the amount you want to withdraw: " + "Your balance: " + balance);
                cekim = input.nextDouble();
                if (cekim > balance) {
                    System.out.println("You cannot withdraw more than the balance in your account ");
                } else {
                    balance -= cekim;
                    System.out.println("Your money is being withdrawn, please wait...");
                    System.out.println("Please get your money. Your remaining balance:\n" + balance);
                }
                break;
            }
            case 3: {
                System.out.println("Your balance: " + balance);
                break;
            }

            case 4: {
                System.out.println("Logging out...");
                System.out.println("We wish you a nice day.");
                break;
            }

            default:
                System.out.println(" Invalid input");
                break;

        }

    }
}