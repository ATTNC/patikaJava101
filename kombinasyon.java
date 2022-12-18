import java.util.Scanner;

public class kombinasyon {


    public static void main(String[] args) {

        int n, r, s, toplam1 = 1, toplam2 = 1, toplam3 = 1, sonuc;

        Scanner input = new Scanner(System.in);

        System.out.println("Kombinasyon için ilk sayiyi giriniz: ");
        n = input.nextInt();
        System.out.println("Kombinasyon için ikinci sayiyi giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            toplam1 *= i;

        }

        for (int j = 1; j <= r; j++) {
            toplam2 *= j;

        }


        s = n - r;

        for (int z = 1; z <= s; z++) {
            toplam3 *= z;
        }

        sonuc = toplam1 / (toplam2 * toplam3);
        System.out.println(sonuc);


    }
}