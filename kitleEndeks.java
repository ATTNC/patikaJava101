import java.util.Scanner;

public class kitleEndeks {


    public static void main(String[] args) {

        double boy,kitleindeks;
        int kilo;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Boyunuzu giriniz (metre cinsinde): ");
        boy=scanner.nextDouble();
        System.out.println("Kilonuzu giriniz: ");
        kilo=scanner.nextInt();
        kitleindeks=kilo/(boy*boy);
        System.out.println("Vücut kitle endekisiniz: "+kitleindeks);


    }
}