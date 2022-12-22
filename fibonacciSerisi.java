import java.util.Scanner;

public class fibonacciSerisi {


    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("How many fibonacci numbers do you want to see: ");
        int number = klavye.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3 = n1 + n2;


        System.out.print(n1 + " " + n2 + " ");

        while (number > 0) {
            System.out.print(n3 + " ");
            number--;
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;


        }


    }
}