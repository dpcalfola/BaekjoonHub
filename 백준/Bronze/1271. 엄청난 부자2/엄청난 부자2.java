import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger m = scan.nextBigInteger();
        BigInteger n = scan.nextBigInteger();

        scan.close();

        BigInteger a = m.divide(n);
        BigInteger b = m.remainder(n);

        System.out.println(a);
        System.out.println(b);


    }
}
