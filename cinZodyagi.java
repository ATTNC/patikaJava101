import java.util.Scanner;

public class cinZodyagi {


    public static void main(String[] args) {

        int dogumYili;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz: ");
        dogumYili = input.nextInt();

        if (dogumYili % 12 == 0) {

            System.out.println("Çin zodyağınız: Maymun ");

        } else if (dogumYili % 12 == 1) {

            System.out.println("Çin zodyağınız: Horoz ");
        }
        else if (dogumYili % 12 == 2) {

            System.out.println("Çin zodyağınız: Köpek ");
        }
        else if (dogumYili % 12 == 3) {

            System.out.println("Çin zodyağınız: Domuz ");
        }
        else if (dogumYili % 12 == 4) {


            System.out.println("Çin zodyağınız: Fare ");
        } else if (dogumYili % 12 == 5) {


            System.out.println("Çin zodyağınız: Öküz ");
        } else if (dogumYili % 12 == 6) {

            System.out.println("Çin zodyağınız: Kaplan ");

        } else if (dogumYili % 12 == 7) {

            System.out.println("Çin zodyağınız: Tavşan");
        } else if (dogumYili % 12 == 8) {

            System.out.println("Çin zodyağınız: Ejderha ");

        } else if (dogumYili % 12 == 9) {

            System.out.println("Çin zodyağınız: Yılan ");
        } else if (dogumYili % 12 == 10) {
            System.out.println("Çin zodyağınız: At ");

        } else if (dogumYili % 12 == 11) {
            System.out.println("Çin zodyağınız: Koyun ");
        }
    }
}