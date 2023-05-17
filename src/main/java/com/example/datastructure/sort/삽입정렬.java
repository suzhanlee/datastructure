package com.example.datastructure.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 삽입정렬 {

    // 앞에서 부터 차례대로 자신의 위치를 찾아 삽입하는 정렬

    static int[] arr;

    public static void sort() {

        for (int i = 1; i < arr.length; i++) {

            int tmp = arr[i];

            for (int j = i - 1; j >= 0; j--) {

                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                    if (j == 0) {
                        arr[0] = tmp;
                    }
                } else {
                    arr[j + 1] = tmp;
                    break;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }


    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {

            arr[i] = Integer.parseInt(st.nextToken());

        }

        sort();

    }

}
