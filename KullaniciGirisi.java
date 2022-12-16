import java.util.Scanner;

public class KullaniciGirisi {


    public static void main(String[] args) {

        String userName, password, newPassword, select;

        System.out.println("kullanıcı adını giriniz");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine();
        System.out.println("şifre giriniz");
        password = scanner.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız");
        } else {
            System.out.println("Hatalı şifre");
            System.out.print("Şifrenizi değiştirmek istiyor musunuz (Evet/Hayır) : ");
            select = scanner.nextLine();

            if (select.equals("Evet")) {

                System.out.println("Yeni şifrenizi giriniz: ");
                newPassword = scanner.nextLine();
                scanner.close();


                if (!newPassword.equals("java123")) {
                    System.out.println("şifre değişti");
                } else {
                    System.out.println("Yeni şifre önceki şifreyle aynı olamaz");
                }
            }
        }


    }
}