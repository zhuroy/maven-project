package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  
  /**
   * @author Roy Zhu
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
