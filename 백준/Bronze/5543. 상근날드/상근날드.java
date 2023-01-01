import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int burger = 2000 ;
        int drink = 2000 ;


        for (int i = 0; i < 3; i++) {
           int temp = Integer.parseInt(br.readLine());
            burger = Math.min(burger , temp) ;

        }

        for (int i = 0; i < 2; i++) {
            int temp = Integer.parseInt(br.readLine());
            drink = Math.min(temp, drink);

        }

        System.out.println(burger + drink - 50);

    }
}
