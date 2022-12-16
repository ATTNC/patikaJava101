import java.util.Scanner;

public class HesapMakinesi {


    public static void main(String[] args) {

        int number1, number2, select;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz: ");
        number1 = scanner.nextInt();
        System.out.println("ikinci sayıyı giriniz: ");
        number2 = scanner.nextInt();
        System.out.println("Yapmak istediğiniz işlemi seçiniz\n" + "1.Toplama 2.Çıkarma 3.Çarpma 4.Bölme");
        select = scanner.nextInt();

        switch (select) {

            case 1:
                System.out.println("Sonuç: " + (number1 + number2));
                break;

            case 2:

                System.out.println("Sonuç:" + (number1 - number2));
                break;

            case 3:

                System.out.println("Sonuç:" + (number1 * number2));
                break;

            case 4:

                System.out.println("Sonuç:" + (number1 / number2));
                break;


        }

    }
}