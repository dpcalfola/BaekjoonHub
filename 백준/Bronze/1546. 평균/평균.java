import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        Double[] arr = new Double[N];
        double sum = 0;
        double maxScore;

        double avg;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }

        br.close();
        
        Arrays.sort(arr);
        maxScore = arr[N - 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / maxScore * 100;
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        avg = sum / N;

        bw.write(avg + "\n");
        bw.flush();
        bw.close();


    }
}
