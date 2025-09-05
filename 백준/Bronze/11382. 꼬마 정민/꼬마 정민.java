import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        long sum = 0;

        while (st.hasMoreTokens()) {
            sum += Long.parseLong(st.nextToken());
        }

        sb.append(sum);

        System.out.println(sb);

    }
}