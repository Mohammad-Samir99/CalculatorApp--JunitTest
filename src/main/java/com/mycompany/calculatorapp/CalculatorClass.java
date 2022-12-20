/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculatorapp;

/**
 *
 * @author MohamadSamir
 */
public class CalculatorClass {
  public double Add (int a, int b) {
  return a + b;
}
public double Sub(int a, int b) {

return a - b;

}

public double Multi (int a, int b) {

return a * b;
      }

public double Divid(int a, int b) throws IllegalArgumentException {
    if (b == 0) throw new IllegalArgumentException ("B cant Be Zero");
return a / b;
}
}
