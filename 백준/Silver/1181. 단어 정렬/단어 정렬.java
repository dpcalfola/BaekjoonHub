import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        LinkedList<String> list = new LinkedList<>(set);

        list.sort(new Mycomparator());

        for ( String s : list){
            System.out.println(s);
        }
    }
}


class Mycomparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() == o2.length()){
            return o1.compareTo(o2);
        }else{
            return o1.length() - o2.length();
        }
    }
}