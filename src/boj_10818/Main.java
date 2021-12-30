package boj_10818;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int tmp = Integer.parseInt(st.nextToken());

        int max = tmp;
        int min = tmp;

        for (int i = 1; i < N; i++) {
            tmp = Integer.parseInt(st.nextToken());
            max = Math.max(max, tmp);
            min = Math.min(min, tmp);
        }

        bw.write(min + " " + max);

        br.close();
        bw.flush();
        bw.close();
    }
}
