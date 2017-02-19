package com.jalvaro.codingtests.codility;

import java.util.Arrays;

class Oc1 {
  public int solution(int[] A) {
    // write your code in Java SE 8
    Arrays.sort(A);

    return A[A.length/2];
  }
}
