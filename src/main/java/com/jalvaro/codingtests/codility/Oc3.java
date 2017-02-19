package com.jalvaro.codingtests.codility;

class Oc3 {
  public int solution(int[] A) {
    // write your code in Java SE 8

    boolean[] used = new boolean[A.length];
    int maxLength = 0;

    for (int i=0; i<A.length; i++) {
      if (!used[i]) {
        maxLength = Math.max(getLengthSet(A, i, used), maxLength);
      }
    }

    return maxLength;
  }

  private int getLengthSet(int[] A, int k, boolean[] used) {
    int l = 0;
    while (!used[k]) {
      l++;
      used[k] = true;
      k = A[k];
    }

    return l;
  }
}
