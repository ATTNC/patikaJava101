import java.util.Scanner;

public class tersUcgen {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, i, tempN, star, space;
        System.out.print("Enter height of triangle : ");
        n = input.nextInt();
        tempN = n;
        for (i = tempN; i >= 1; i--) {
            for (space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (star = 1; star <= (2 * i) - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}