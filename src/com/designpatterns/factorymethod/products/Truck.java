package com.designpatterns.factorymethod.products;

public class Truck implements Transport {
  @Override
  public void deliver() {
    System.out.println("Truck delivered");
  }
}
