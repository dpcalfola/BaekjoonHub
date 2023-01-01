import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int distanceV = h - y; // 위로 걸어가는 거리
        int distanceH = w - x; // 오른쪽으로 걸어가는 거리
        // 왼쪽으로 걸어가는 거리 : x
        // 아래로 걸어가는 거리 : y

        int midAnswer = Math.min(distanceH, distanceV);
        int midAnswer2 = Math.min(x, y);
        int answer = Math.min(midAnswer, midAnswer2);


        System.out.println(answer);


    }
}
