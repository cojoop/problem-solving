import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int fNum = Integer.parseInt(br.readLine());
        String sNum = br.readLine();

        int[] arr = new int[sNum.length()];

        for (int i = 0; i < sNum.length(); i++) {
            arr[i] = sNum.charAt(i) - '0';
        }

        for (int i = sNum.length() - 1; i >= 0; i--) {
            sb.append(fNum * arr[i]).append("\n");
        }

        sb.append(fNum * Integer.parseInt(sNum));

        System.out.println(sb);

    }
}