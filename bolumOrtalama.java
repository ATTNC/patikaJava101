import java.util.Scanner;

public class bolumOrtalama {


    public static void main(String[] args) {

        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        sayi = input.nextInt();


        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
            }
        }

    }
}