import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int year = scan.nextInt();
        int result = 0 ;
        if (((year%4 == 0) && (year%100 !=0)) || ((year%4==0) && (year%400 == 0))){
            result = 1 ;

        }
        System.out.println(result);
    }
}
