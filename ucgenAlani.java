import java.util.Scanner;

public class ucgenAlani {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int kenar1,kenar2,kenar3;

        System.out.println("Kenar 1'in uzunluğunu giriniz: ");
        kenar1=scanner.nextInt();
        System.out.println("Kenar 2'in uzunluğunu giriniz: ");
        kenar2=scanner.nextInt();
        System.out.println("Kenar 3'in uzunluğunu giriniz: ");
        kenar3=scanner.nextInt();

       int u= (kenar1+kenar2+kenar3)/2;
       int ucgenAlan = (u*(u-kenar1)*(u-kenar2)*(u-kenar3))^(1/2);
        System.out.println("Üçgenin alanı: "+ucgenAlan);

    }
}