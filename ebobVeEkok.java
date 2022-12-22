import java.util.Scanner;

public class ebobVeEkok {


    public static void main(String[] args) {

        int n1,n2;
        int ebob,ekok,remainder,min,max;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        n1=input.nextInt();
        System.out.println("Enter second number:");
        n2=input.nextInt();

        if (n1>n2)
        {
            min=n1;
            max=n2;
        }
        else
        {
            min=n2;
            max=n1;
        }
        remainder=min%max;
        while(remainder!=0)
        {
            min=max;
            max=remainder;
            remainder=min%max;
        }
        ebob = max;
        ekok = n1*n2/ebob;
        System.out.println("EBOB: "+ebob);
        System.out.println("EKOK: "+ekok);
    }
}