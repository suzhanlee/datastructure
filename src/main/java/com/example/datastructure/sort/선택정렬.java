package com.example.datastructure.sort;

public class 선택정렬 {

    // 작은 데이터를 선별하여 데이터를 앞으로 보내는 방식의 정렬

    static int[] arr;

    public static void main(String[] args) {

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


    }

}
