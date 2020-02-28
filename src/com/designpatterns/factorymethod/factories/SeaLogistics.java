package com.designpatterns.factorymethod.factories;

import com.designpatterns.factorymethod.products.Ship;
import com.designpatterns.factorymethod.products.Transport;

public class SeaLogistics extends Logistics {
  @Override
  protected Transport createTransport() {
    return new Ship();
  }
}
