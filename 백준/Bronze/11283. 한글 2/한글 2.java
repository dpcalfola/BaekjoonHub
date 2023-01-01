import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String h = scan.next();
        scan.close();
        int a = h.charAt(0) - 44031 ;
        System.out.println(a);

    }
}