import java.util.Scanner;

public class daireDilimi {


    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int yaricap,merkezaci;
        double dairedilimi;

        System.out.println("Dairenin yarıcapını giriniz: ");
        yaricap=scanner.nextInt();
        System.out.println("Merkez açı giriniz: ");
        merkezaci=scanner.nextInt();
        dairedilimi=3.14*yaricap*yaricap*merkezaci/360;
        System.out.println("Daire diliminin alanı: "+dairedilimi);


    }
}