package com.example.datastructure.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 선택정렬 { // clear

    // 작은 데이터를 선별하여 데이터를 앞으로 보내는 방식의 정렬

    static int[] arr;

    public static void sort() {

        for (int i = 0; i < arr.length - 1; i++) {

            int idx = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }

            int tmp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = tmp;

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
