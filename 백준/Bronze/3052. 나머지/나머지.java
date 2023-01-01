import java.util.Scanner;

public class Main {

    static int[] num = new int[10];


    public static void main(String[] args) {


        get10num(); // 숫자 10개를 받음


        int[] reminder = new int[42] ;
        int count = 0 ;

        for ( int i = 0 ; i < reminder.length ; i++){
            // 42번 반복
            for ( int j = 0 ; j < num.length ; j++){
                //10번 반복
                if ( num[j]%42==i) {
                    reminder[i] = 1;
                }
            }
        }

        for ( int i = 0 ; i < reminder.length ; i++) {
//            System.out.println(reminder[i]);

            if (reminder[i]!=0){
                count++;
            }
        }

        System.out.println(count);

    }

    private static void get10num() {
        // 숫자 열 개를 받아서 배열에 집어넣는다.


        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            num[i] = scan.nextInt();
        }

    }
}

