import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            String readLine = br.readLine();
            if (readLine == null || readLine.isBlank()) {
                break;
            }else{
                sb.append(readLine).append("\n");
            }
        }
        br.close();
        System.out.println(sb);
    }
}
