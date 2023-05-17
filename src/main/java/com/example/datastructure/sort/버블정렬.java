package com.example.datastructure.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 버블정렬 { //

    // 바로 앞에 있는 것과 비교해서 정렬하는 방식

    static int[] arr;

    public static void sort() {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length -1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
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
