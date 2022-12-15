import java.util.Scanner;

public class ortalamaHesaplama {


    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,muzik;
        double ort;
        Scanner scanner=new Scanner(System.in);

        System.out.println("matematik notunuzu giriniz: ");
        mat=scanner.nextInt();

        System.out.println("fizik notunuzu giriniz: ");
        fizik=scanner.nextInt();

        System.out.println("kimya notunuzu giriniz: ");
        kimya=scanner.nextInt();

        System.out.println("turkce notunuzu giriniz: ");
        turkce=scanner.nextInt();

        System.out.println("muzik notunuzu giriniz: ");
        muzik=scanner.nextInt();

        ort=(mat+fizik+kimya+turkce+muzik)/5;
        System.out.println("ortalamanız: "+ort);

        String sonuc=(ort>=60)? "Geçtiniz" : "Kaldınız";
        System.out.println("Sonucunuz: "+sonuc);

    }
}