import java.util.Scanner;

public class harmonikSayi {


    public static void main(String[] args) {

        int sayi,i;
       double toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.println("N sayısını giriniz: ");
        sayi=input.nextInt();

        for (i=1;i<=sayi;i++){

            toplam+= (1.0/i);

        }

        System.out.println("Sonuç: "+toplam);


    }
}