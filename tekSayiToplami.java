import java.util.Scanner;

public class tekSayiToplami {


    public static void main(String[] args) {

        int sayi,n;
        int toplam = 0;
        Scanner num = new Scanner(System.in);

        do {
            System.out.println("sayıyı giriniz:");
            sayi = num.nextInt();



            for (n=0;n<=sayi;n++) {


                if ( n % 4 == 0) {
                    toplam += n;


                }


            }

            if(sayi %2==0) {
                toplam=toplam+2;//Burada toplama 2 ekliyoruz çünkü, şartımız 4 e tam bölünen sayılar yani 2 yi atlıyoruz.(yukarıda if bloğunun koşulu)

            }



        } while (sayi %2 != 1);


        toplam=toplam+2;//Burada toplama 2 ekliyoruz çünkü, şartımız 4 e tam bölünen sayılar yani 2 yi atlıyoruz.(yukarıda if bloğunun koşulu)
        System.out.println("Toplam: "+toplam);


    }
}