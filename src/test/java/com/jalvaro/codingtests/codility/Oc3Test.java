package com.jalvaro.codingtests.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Oc3Test {
  @Test
  public void test() {
    Oc3 sol = new Oc3();
    assertEquals(1, sol.solution(new int[] {0}));
    assertEquals(2, sol.solution(new int[] {1, 0}));
    assertEquals(1, sol.solution(new int[] {0, 1}));
    assertEquals(3, sol.solution(new int[] {1, 2, 0}));
    assertEquals(2, sol.solution(new int[] {2, 1, 0}));
    assertEquals(3, sol.solution(new int[] {2, 0, 1}));
    assertEquals(4, sol.solution(new int[] {5,4,0,3,1,6,2}));
  }
}
