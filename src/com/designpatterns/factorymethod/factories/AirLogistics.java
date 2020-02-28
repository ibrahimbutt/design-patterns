package com.designpatterns.factorymethod.factories;

import com.designpatterns.factorymethod.products.Plane;
import com.designpatterns.factorymethod.products.Transport;

public class AirLogistics extends Logistics {
  @Override
  protected Transport createTransport() {
    return new Plane();
  }
}
