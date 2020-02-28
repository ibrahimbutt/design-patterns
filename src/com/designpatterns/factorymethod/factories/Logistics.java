package com.designpatterns.factorymethod.factories;

import com.designpatterns.factorymethod.products.Transport;

public abstract class Logistics {
  public void planDelivery() {
    Transport transport = this.createTransport();
    transport.deliver();
  }

  protected abstract Transport createTransport();
}
