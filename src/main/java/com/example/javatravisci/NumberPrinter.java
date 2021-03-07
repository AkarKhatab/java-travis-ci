package com.example.javatravisci;

class NumberPrinter {


  NumberPrinter() {
  }

  void printNumbers() {
    for(int x=1; x<=10; x++){
      if (x != 8) {
        System.out.println(x);
      }
    }
  }
}
