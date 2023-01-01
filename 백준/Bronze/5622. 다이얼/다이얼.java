import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] chaArr = str.toCharArray();
        int[] intArr = new int[str.length()];

        for (int i = 0; i < chaArr.length; i++) {
            intArr[i] = chaArr[i] - 65;
        }

        int time = 0;
        for (int j : intArr) {
            if (j < 15) {
                time += j / 3 + 3;
            } else if (j < 19){
                time += 8;
            } else if (j < 22) {
                time += 9;
            } else {
                time += 10;
            }
        }
        System.out.println(time);
    }
}