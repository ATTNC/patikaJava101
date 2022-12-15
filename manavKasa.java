import java.util.Scanner;

public class manavKasa {

    public static void main(String[] args) {


        double armut, elma, domates, muz, patlıcan, toplam;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç kilogram armut aldınız: ");
        armut = scanner.nextDouble();
        armut = armut * (2.14);

        System.out.println("Kaç kilogram elma aldınız: ");
        elma = scanner.nextDouble();
        elma = elma * (3.67);

        System.out.println("Kaç kilogram domates aldınız: ");
        domates = scanner.nextDouble();
        domates = domates * (1.11);

        System.out.println("Kaç kilogram muz aldınız: ");
        muz = scanner.nextDouble();
        muz = muz * (0.95);

        System.out.println("Kaç kilogram patlıcan aldınız: ");
        patlıcan = scanner.nextDouble();
        patlıcan = patlıcan * (5.00);

        toplam = armut + elma + domates + muz + patlıcan;
        System.out.println("Toplam tutar: " + toplam);


    }
}