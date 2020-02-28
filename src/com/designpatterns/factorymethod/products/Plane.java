package com.designpatterns.factorymethod.products;

public class Plane implements Transport {

  @Override
  public void deliver() {
    System.out.println("Plane delivered");
  }
}
