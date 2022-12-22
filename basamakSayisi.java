import java.util.Scanner;

public class basamakSayisi {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = input.nextInt();
        int sayiDegeri = sayi;
        int basamakDegeri;
        int totalNumber = 0;

        while (sayiDegeri != 0) {
            basamakDegeri = sayiDegeri % 10;
            totalNumber = basamakDegeri + totalNumber;
            sayiDegeri /= 10;
        }
        System.out.println(sayi + " sayısının rakamlarının toplamı: " + totalNumber);
    }
}