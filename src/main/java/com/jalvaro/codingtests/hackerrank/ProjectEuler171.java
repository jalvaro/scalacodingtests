package com.jalvaro.codingtests.hackerrank;

import java.util.Scanner;

/**
 * Created by jalvaro on 31/01/17.
 */
public class ProjectEuler171 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long digits = sc.nextLong();

    System.out.println(sum(digits));
  }

  public static long sum(long digits) {
    long sum = 0;

    for (long i=1; i<=digits; i++) {
      long squareOfDigits = squareOfdigits(i);

      if (isPerfectSquare(squareOfDigits)) {
        sum += i;
      }
    }

    return sum;
  }

  static long squareOfdigits(long val) {
    String[] digits = Long.toString(val).split("");
    long res = 0;

    for (String c : digits) {
      long v = Integer.parseInt(c);
      res += v*v;
    }

    return res;
  }

  static boolean isPerfectSquare(long val) {
    long sqrt = Math.round(Math.sqrt(val));

    return sqrt*sqrt == val;
  }
}
