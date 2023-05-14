package com.example.datastructure.sort;

public class 버블정렬 {

    // 바로 앞에 있는 것과 비교해서 정렬하는 방식

    static int[] arr;

    public static void main(String[] args) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length -1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }

            }
        }
    }
}
