package com;

public class UnaryOperation {
  public static void main(String[] args) {
    //

      double number = 5.2, resultNumber;
      boolean flag = false;
    System.out.println("+number = " + +number);
    // number is equal 5.2 hear.

    System.out.println("-number = " + -number);

    // Number is equivalent to number =number   + 1.
    System.out.println("++number = " + ++number);

    // Number is equivalent to number =number - 1.
    System.out.println("--number = " + --number);

    System.out.println("!flag = " + !flag);
    //flag still false

      number = 5.2;
    System.out.println(number++);
    System.out.println(number);
    System.out.println(++number);
    System.out.println(number);
  }
}
