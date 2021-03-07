package com.example.javatravisci;

class TriangleArea {

  private float area;

  TriangleArea() {}

  float calculateArea(Coordinates a, Coordinates b, Coordinates c) {

    area = (a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2.0f;

    return Math.abs(area);
  }

}
