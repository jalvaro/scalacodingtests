package com.jalvaro.codingtests.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Oc1Test {
  @Test
  public void test() {
    Oc1 sol = new Oc1();
    assertEquals(5, sol.solution(new int[] {1,2,5,10,20,1}));
    assertEquals(5, sol.solution(new int[] {1,2,5,10,20}));
    assertEquals(1, sol.solution(new int[] {1}));
    assertEquals(101, sol.solution(new int[] {101,1}));
  }
}
