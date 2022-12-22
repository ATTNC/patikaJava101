import java.util.Scanner;

public class minMaxNumber {


    public static void main(String[] args) {

        int numbers, i, number, max = 0, min = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will you enter: ");
        numbers = input.nextInt();

        for (i = 0; i < numbers; i++) {
            System.out.print("Enter Number : ");
            number = input.nextInt();

            if (number == 1) {
                max = number;
                min = number;
            }

            if (number >= max) {
                max = number;
            }
            if (number <= min) {
                min = number;
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);

    }
}