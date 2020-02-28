package com.designpatterns.factorymethod.factories;

import com.designpatterns.factorymethod.products.Transport;
import com.designpatterns.factorymethod.products.Truck;

public class RoadLogistics extends Logistics {
  @Override
  protected Transport createTransport() {
    return new Truck();
  }
}
