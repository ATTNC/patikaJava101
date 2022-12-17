import java.util.Scanner;

public class ucakBileti {


    public static void main(String[] args) {

        double mesafe, tutar;
        int yas, yolculukTip;
        ;

        Scanner input = new Scanner(System.in);
        System.out.println("mesafe giriniz: ");
        mesafe = input.nextDouble();

        System.out.println("yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.println("Yolculuk tipini seçiniz Gidiş->1 Gidiş_Dönüş->2");
        yolculukTip = input.nextInt();

        if (mesafe <= 0 || yas <= 0) {

            System.out.println("Hatali giriş yaptiniz");
        }

        if (yolculukTip <= 0 || yolculukTip >= 3) {
            System.out.println("Hatali giriş yaptınız");

        }

        if (yas < 12 && yolculukTip == 1) {

            System.out.println("Bilete %50 indirim uygulandı");
            tutar = (mesafe * 0.1) - (mesafe * 0.1 * 50 / 100);
            System.out.println("biletinizin tutarı: " + tutar);
        } else if (yas < 12 && yolculukTip == 2) {
            tutar = (mesafe * 0.1) - (mesafe * 0.1 * 50 / 100);
            tutar = tutar * 2;
            tutar = tutar - (tutar * 20) / 100;
            System.out.println("biletinizin tutarı: " + tutar);

        }

        if (yas > 12 && yas < 24 && yolculukTip == 1) {
            tutar = (mesafe * 0.1) - (mesafe * 0.1 * 10 / 100);
            System.out.println("biletinizin tutarı: " + tutar);


        } else if (yas > 12 && yas < 24 && yolculukTip == 2) {
            tutar = (mesafe * 0.1) - (mesafe * 0.1 * 10 / 100);
            tutar = tutar * 2;
            tutar = tutar - (tutar * 20) / 100;
            System.out.println("biletinizin tutarı: " + tutar);


        }
        if (yas > 65 && yolculukTip == 1) {

            tutar = (mesafe * 0.1) - (mesafe * 0.1 * 30 / 100);
            System.out.println("biletinizin tutarı: " + tutar);
        } else if (yas > 65 && yolculukTip == 2) {

            tutar = (mesafe * 0.1) - (mesafe * 0.1 * 30 / 100);
            tutar = tutar * 2;
            tutar = tutar - (tutar * 20) / 100;
            System.out.println("biletinizin tutarı: " + tutar);
        }


    }


}
