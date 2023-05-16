package com.example.datastructure.sort;


public class 합병정렬 {

    private static int[] sorted;		// 합치는 과정에서 정렬하여 원소를 담을 임시배열

    public static void merge_sort(int[] a) {

        sorted = new int[a.length];
        merge_sort(a, 0, a.length - 1);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        sorted = null;
    }

    // Top-Down 방식 구현
    private static void merge_sort(int[] a, int left, int right) {

        /*
         *  left==right 즉, 부분리스트가 1개의 원소만 갖고있는경우
         *  더이상 쪼갤 수 없으므로 return한다.
         */
        if(left == right) return;

        int mid = (left + right) / 2;	// 절반 위치

        merge_sort(a, left, mid);		// 절반 중 왼쪽 부분리스트(left ~ mid)
        merge_sort(a, mid + 1, right);	// 절반 중 오른쪽 부분리스트(mid+1 ~ right)

        merge(a, left, mid, right);		// 병합작업

    }

    private static void merge(int[] a, int left, int mid, int right) {
        int l = left;		// 왼쪽 부분리스트 시작점
        int r = mid + 1;	// 오른쪽 부분리스트의 시작점
        int idx = left;		// 채워넣을 배열의 인덱스


        while(l <= mid && r <= right) {

            if(a[l] <= a[r]) {
                sorted[idx] = a[l];
                idx++;
                l++;
            } else {
                sorted[idx] = a[r];
                idx++;
                r++;
            }
        }

        if(l > mid) {
            while(r <= right) {
                sorted[idx] = a[r];
                idx++;
                r++;
            }
        } else {
            while(l <= mid) {
                sorted[idx] = a[l];
                idx++;
                l++;
            }
        }

        for(int i = left; i <= right; i++) {
            a[i] = sorted[i];
        }
    }

    public static void main(String[] args) {
        int[] ints = {2, 6, 4, 3, 8, 5};

        merge_sort(ints);
    }
}