public class recursivePrime {


    public static int isPrime(int a) {

        int count = 0;
        for (int i = 1; i <= a; i++) {

            if (a % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(a + " is Prime !");
            return count;
        }
        System.out.println(a + " is not Prime!");
        return count;


    }


    public static void main(String[] args) {

        isPrime(17);

    }
}