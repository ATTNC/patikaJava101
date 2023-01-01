import java.util.Scanner;

public class methodByPattern {


    public static int pattern(int number, int patternNumber, int stop) {

        if (number > 0) {
            System.out.print(number + " ");
            return pattern(number - 5, patternNumber - 5, stop);
        }
        if (patternNumber <= stop) {
            System.out.print(patternNumber + " ");
            return pattern(number, patternNumber + 5, stop);
        }
        return stop;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter a positive number: ");
        number = scanner.nextInt();
        pattern(number, number, number);
        System.out.println();


    }
}