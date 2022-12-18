import java.util.Scanner;

public class kuvvet {


    public static void main(String[] args) {


        int sayi, i;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        sayi = input.nextInt();
        for (i = 0; i <= sayi; i++) {

            if (i % 4 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }


    }
}