package com.designpatterns.factorymethod;

import com.designpatterns.factorymethod.factories.AirLogistics;
import com.designpatterns.factorymethod.factories.Logistics;
import com.designpatterns.factorymethod.factories.RoadLogistics;
import com.designpatterns.factorymethod.factories.SeaLogistics;

public class Main {

  private static Logistics logistics;

  public static void main(String[] args) {
    init();
    logistics.planDelivery();
  }

  private static void init() {
    setLogisticsType();
  }

  private static void setLogisticsType() {
    String logisticType = "Road";

    if (logisticType.equals("Road")) logistics = new RoadLogistics();
    else if (logisticType.equals("Ship")) logistics = new SeaLogistics();
    else if (logisticType.equals("Air")) logistics = new AirLogistics();

    throw new Error("Invalid Logistics type");
  }
}
