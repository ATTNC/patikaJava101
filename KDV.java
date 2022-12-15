import java.util.Scanner;

public class KDV {


    public static void main(String[] args) {

        double tutar, kdvOrani = 0.18;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz: ");
        tutar = scanner.nextDouble();
        double kdvTutari = tutar * kdvOrani;
        double kdvliTutar = tutar + kdvTutari;

        if(tutar>1000){
            kdvOrani=0.08;
            kdvTutari = tutar * kdvOrani;
            kdvliTutar = tutar + kdvTutari;
            System.out.println("KDV'siz tutar: " + tutar);
            System.out.println("KDV oranı: " + kdvOrani);
            System.out.println("KDV Tutarı: " + kdvTutari);
            System.out.println("KDV'li Fiyat: " + kdvliTutar);

        }
        else {
           kdvTutari = tutar * kdvOrani;
           kdvliTutar = tutar + kdvTutari;
            System.out.println("KDV'siz tutar: " + tutar);
            System.out.println("KDV oranı: " + kdvOrani);
            System.out.println("KDV Tutarı: " + kdvTutari);
            System.out.println("KDV'li Fiyat: " + kdvliTutar);
        }

    }
}