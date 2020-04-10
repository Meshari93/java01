package com;

public class LogicalOperation {
  public static void main(String[] args) {
    //

      int number1 = 1 , number2 = 2, number3 = 3;
      boolean result;

      // At lest one expression needs to be true for the result to be true
      result = (number1 > number2) || (number3 > number1);
    System.out.println(result);

    result = (number1 > number2) && (number3 > number1);
    System.out.println(result);
  }
}
