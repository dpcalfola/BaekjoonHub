import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        // str.substring(i, 마지막 인덱스) 를 반복문 돌린다.
        // 각각의 값을 list 에 add

        ArrayList<String> strList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            strList.add(str.substring(i));
        }

        Collections.sort(strList);

        for (String s : strList) {
            System.out.println(s);

        }
    }
}