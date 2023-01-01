import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0 ;
        int total = 0 ;
        for (int i = 0; i < 5; i++) {

            score = scan.nextInt() ;
            total += score ;

        }

        scan.close();

        System.out.println(total);


    }
}