import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        System.out.println(N*N*Math.PI );
        System.out.println(N*N*2);

    }
}
