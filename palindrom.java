import java.util.Scanner;

public class palindrom {

    static boolean isPalindrome(int number) {

        int temp = number, reverseNumber = 0, lastNumber;
        while (temp > 0) {

            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (reverseNumber == number)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {

        int number;
        Scanner mec = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        number = mec.nextInt();

        if (isPalindrome(number))
            System.out.println(number + " palindrom bir sayıdır");
        else

            System.out.println(number + " palindrom sayı değildir");


    }
}


