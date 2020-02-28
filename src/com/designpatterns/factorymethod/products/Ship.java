package com.designpatterns.factorymethod.products;

public class Ship implements Transport {
  @Override
  public void deliver() {
    System.out.println("Ship delivered");
  }
}
