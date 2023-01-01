
import java.io.*;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
        }
        br.close();

        bw.write(sum%10 + "\n");
        bw.flush();
        bw.close();
        
    }

}