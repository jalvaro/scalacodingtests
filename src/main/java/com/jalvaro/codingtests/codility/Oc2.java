package com.jalvaro.codingtests.codility;

import java.util.Arrays;

class Oc2 {
  public int solution(int[] A) {
    // write your code in Java SE 8

    Arrays.sort(A);

    int iniPos = 0;
    int max = 0;
    int maxPos = 0;

    for (int i=0; i<A.length; i++) {

      if (i == A.length-1 || A[i] != A[i+1]) {
        int newMax = i - iniPos + 1;

        if (newMax > max) {
          max = newMax;
          maxPos = iniPos;
        }

        iniPos = i + 1;
      }
    }

    return A[maxPos];
  }
}
