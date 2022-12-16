import java.util.Scanner;

public class sinifGecme {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int mat, fizik, turkce, kimya, muzik;
        int toplamNot, ders = 5;
        double ortalama;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = scanner.nextInt();
        if ((mat <= 0) && (mat >= 100)) {
           mat=0;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        fizik = scanner.nextInt();
        if ((fizik <= 0) && (fizik >= 100)) {
            fizik=0;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = scanner.nextInt();
        if ((turkce <= 0) && (turkce >=100)) {
            turkce=0;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();
        if ((kimya <= 0) && (kimya >= 100)) {
            kimya=0;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = scanner.nextInt();
        if ((muzik <= 0) && (muzik >= 100)) {
            muzik=0;

        }

        toplamNot = mat + muzik + turkce + kimya + fizik;
        ortalama = (toplamNot / ders);

        System.out.println("Ortalamanız: " + ortalama);
        if (ortalama >= 55) {
            System.out.print("Sınıfı Geçtiniz !");
        }
        else {
            System.out.print("Sınıfta Kaldınız !");
        }

    }
}