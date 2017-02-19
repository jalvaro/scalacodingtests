package com.jalvaro.codingtests.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Oc2Test {
  @Test
  public void test() {
    Oc2 sol = new Oc2();
    assertEquals(1, sol.solution(new int[] {1,3,2,1,2,1,5,3,3,4,2}));
    assertEquals(2, sol.solution(new int[] {0,0,0,0,2,2,2,3,3,3,0,0,0,20,2,2,2,2,2,2,2,2,2}));
    assertEquals(1, sol.solution(new int[] {1}));
    assertEquals(1, sol.solution(new int[] {1, 9}));
    assertEquals(90, sol.solution(new int[] {1, 90, 9, 90}));
    assertEquals(9, sol.solution(new int[] {10, 9, 90}));
    assertEquals(9, sol.solution(new int[] {100, 9, 90}));
    assertEquals(7, sol.solution(new int[] {1, 9, 8, 7, 4, 8, 7, 10, 31, 2}));
    assertEquals(2, sol.solution(new int[] {1, 9, 8, 7, 4, 8, 7, 10, 31, 2,2}));
    assertEquals(1, sol.solution(new int[] {1, 9, 8, 7, 4, 8, 7, 10, 31, 2,2,1,1,1}));
  }
}
