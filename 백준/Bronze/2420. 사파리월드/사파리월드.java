import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Long n1 = scan.nextLong();
        Long n2 = scan.nextLong();

        Long dif = Math.abs(n2-n1);


        System.out.println(dif);

    }
}

