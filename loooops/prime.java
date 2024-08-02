import java.util.*;

public class prime {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number to be checked");
        n = sc.nextInt();
        boolean isPrime = true;
        for (i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;

            }
        }
        if (isPrime == true) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }
}