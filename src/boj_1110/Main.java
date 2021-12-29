package boj_1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int newN = N;
        int answer = 0;

        do {
            int tmp = (newN / 10) + (newN % 10);
            newN = (newN % 10) * 10 + (tmp % 10);
            answer++;
        } while (newN != N);

        System.out.println(answer);
    }
}
