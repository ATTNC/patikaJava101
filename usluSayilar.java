import java.util.Scanner;

public class usluSayilar {


    public static void main(String[] args) {

        int i, sayi, us, sonuc = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        sayi = input.nextInt();
        System.out.println("Üssü giriniz: ");
        us = input.nextInt();

        for (i = 1; i <= us; i++) {

            sonuc *= sayi;


        }
        System.out.println("Sonuç: " + sonuc);

    }
}