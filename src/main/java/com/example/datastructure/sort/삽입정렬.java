package com.example.datastructure.sort;

public class 삽입정렬 {

    static int[] arr;

    public static void main(String[] args) {

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


    }

}
