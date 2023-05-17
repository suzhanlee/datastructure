package com.example.datastructure.알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnionFind {

    static int[] unf;

    public static int find(int x) {

        if(x == unf[x]) {
            return unf[x];
        } else {
            return unf[x] = find(unf[x]);
        }

    }

    public static void union(int a, int b) {

        int fa = find(a);
        int fb = find(b);

        if (fa != fb) {
            unf[fa] = fb;
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        unf = new int[N + 1];

        // 일단 배열을 해당 인덱스로 초기화


    }


}
