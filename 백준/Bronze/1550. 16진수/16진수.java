import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        int result = Integer.parseInt(s, 16);
        System.out.println(result);


    }
}
