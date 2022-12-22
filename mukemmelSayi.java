import java.util.Scanner;

public class mukemmelSayi {

    public static void main(String[] args) {


        int number, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println("it's the perfect number");
        } else {
            System.out.println("is not a perfect number");
        }
    }
}