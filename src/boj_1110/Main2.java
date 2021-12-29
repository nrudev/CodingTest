package boj_1110;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = N;
        int answer = 0;

        do {
            int tmp = (M / 10) + (M % 10);
            M = (M % 10) * 10 + (tmp % 10);
            answer++;
        } while (M != N);

        bw.write(answer + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
