package com.jalvaro.codingtests.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jalvaro on 31/01/17.
 */
public class ProjectEuler171Test {

  @Test
  public void testSum1() {
    assertEquals(1, ProjectEuler171.sum(1));
  }

  @Test
  public void testSum2() {
    assertEquals(3, ProjectEuler171.sum(2));
  }

  @Test
  public void testSum100() {
    assertEquals(826, ProjectEuler171.sum(100));
  }

  @Test
  public void testSum0() {
    assertEquals(0, ProjectEuler171.sum(0));
  }

  @Test
  public void testSum1000000000000000000000000000000() {
    assertEquals(0, ProjectEuler171.sum(0));
  }

  @Test
  public void testsquare6() {
    assertEquals(36, ProjectEuler171.squareOfdigits(6));
  }

  @Test
  public void testsquare60() {
    assertEquals(36, ProjectEuler171.squareOfdigits(60));
  }

  @Test
  public void testsquare68() {
    assertEquals(100, ProjectEuler171.squareOfdigits(68));
  }

  @Test
  public void testsquare43() {
    assertEquals(25, ProjectEuler171.squareOfdigits(43));
  }
}
