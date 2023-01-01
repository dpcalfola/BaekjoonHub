import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        scan.close();


        for (int j = 0; j < num; j++) {

            for (int i = 2; (num - j) - i >= 0; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}