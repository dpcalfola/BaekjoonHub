import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c ;
        c = 0;

        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = b + (b-a);

        System.out.println(c);

    }
}
