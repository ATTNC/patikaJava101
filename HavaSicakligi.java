import java.util.Scanner;

public class HavaSicakligi {


    public static void main(String[] args) {


        int sıcaklık;

        Scanner scan = new Scanner(System.in);
        System.out.print("Hava sicakligi: ");
        sıcaklık = scan.nextInt();

        if (sıcaklık <= 5) {
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if (sıcaklık > 5 && sıcaklık <= 15) {
            System.out.println("Sinemaya gidebilirsiniz. ");
        }
        else if (sıcaklık > 15 && sıcaklık <= 25 ) {
            System.out.println("Piknike gidebilirsiniz. ");
        }
        else if (sıcaklık > 25) {
            System.out.println("Yuzmeye gidebilirsiniz. ");

        }
    }
}