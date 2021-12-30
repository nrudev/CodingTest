package boj_2562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        arr[0] = sc.nextInt();

        int max = arr[0];
        int maxIdx = 1;

        for (int i = 1; i < 9; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);

            if (max == arr[i]) {
                maxIdx = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(maxIdx);
    }
}
