package com.example.javatravisci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleAreaTest {

  //First test should fail and branch not mergeable after status checks.

  private TriangleArea triangleArea = new TriangleArea();

  @Test
  public void testCalculateArea_withPositiveNumbers() {
    //Given
    float expectedArea = 0.0f;
    Coordinates a = new Coordinates(0, 0);
    Coordinates b = new Coordinates(2, 4);
    Coordinates c = new Coordinates(4, 0);

    //When
    float actualArea = triangleArea.calculateArea(a, b, c);

    //Then
    assertEquals(expectedArea, actualArea, 0.0f);
  }

  @Test
  public void testCalculateArea_withPositiveAndNegativeNumbers() {
    //Given
    float expectedArea = 616.5f;
    Coordinates a = new Coordinates(-33, 15);
    Coordinates b = new Coordinates(16, -2);
    Coordinates c = new Coordinates(-45, -6);

    //When
    float actualArea = triangleArea.calculateArea(a, b, c);

    //Then
    assertEquals(expectedArea, actualArea, 0.0f);
  }
}
