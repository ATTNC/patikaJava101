import java.util.Scanner;

public class recursiveMethod {

    public static void exponentinal(int a, int b) {

        int result = 1;


        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Result is : " + result);

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a base value : ");
        int a = scanner.nextInt();
        System.out.println("Enter exponent : ");
        int b = scanner.nextInt();
        exponentinal(a, b);


    }
}