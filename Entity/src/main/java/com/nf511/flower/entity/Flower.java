package com.nf511.flower.entity;


public class Flower {

  private long flowerId;
  private long flowerTypeId;
  private long flowerUseId;
  private long flowerBranchNumberId;
  private double flowerMarketPrice;
  private double flowerPrice;
  private long flowerInventory;
  private String flowerImageName;
  private String flowerName;
  private String flowerDateTime;
  private String flowerMaterials;
  private String flowerPackaging;
  private String flowerLanguage;
  private String flowerIntroduce;
  private long stateId;

  private Flowertype flowertype;
  private Floweruse floweruse;
  private Flowerbranchnumber flowerbranchnumber;
  private State state;
  private int skip;
  private int size;


  public long getFlowerId() {
    return flowerId;
  }

  public void setFlowerId(long flowerId) {
    this.flowerId = flowerId;
  }


  public long getFlowerTypeId() {
    return flowerTypeId;
  }

  public void setFlowerTypeId(long flowerTypeId) {
    this.flowerTypeId = flowerTypeId;
  }


  public long getFlowerUseId() {
    return flowerUseId;
  }

  public void setFlowerUseId(long flowerUseId) {
    this.flowerUseId = flowerUseId;
  }


  public long getFlowerBranchNumberId() {
    return flowerBranchNumberId;
  }

  public void setFlowerBranchNumberId(long flowerBranchNumberId) {
    this.flowerBranchNumberId = flowerBranchNumberId;
  }


  public double getFlowerMarketPrice() {
    return flowerMarketPrice;
  }

  public void setFlowerMarketPrice(double flowerMarketPrice) {
    this.flowerMarketPrice = flowerMarketPrice;
  }


  public double getFlowerPrice() {
    return flowerPrice;
  }

  public void setFlowerPrice(double flowerPrice) {
    this.flowerPrice = flowerPrice;
  }


  public long getFlowerInventory() {
    return flowerInventory;
  }

  public void setFlowerInventory(long flowerInventory) {
    this.flowerInventory = flowerInventory;
  }


  public String getFlowerImageName() {
    return flowerImageName;
  }

  public void setFlowerImageName(String flowerImageName) {
    this.flowerImageName = flowerImageName;
  }


  public String getFlowerName() {
    return flowerName;
  }

  public void setFlowerName(String flowerName) {
    this.flowerName = flowerName;
  }

  public String getFlowerDateTime() {
    return flowerDateTime;
  }

  public void setFlowerDateTime(String flowerDateTime) {
    this.flowerDateTime = flowerDateTime;
  }

  public String getFlowerMaterials() {
    return flowerMaterials;
  }

  public void setFlowerMaterials(String flowerMaterials) {
    this.flowerMaterials = flowerMaterials;
  }


  public String getFlowerPackaging() {
    return flowerPackaging;
  }

  public void setFlowerPackaging(String flowerPackaging) {
    this.flowerPackaging = flowerPackaging;
  }


  public String getFlowerLanguage() {
    return flowerLanguage;
  }

  public void setFlowerLanguage(String flowerLanguage) {
    this.flowerLanguage = flowerLanguage;
  }


  public String getFlowerIntroduce() {
    return flowerIntroduce;
  }

  public void setFlowerIntroduce(String flowerIntroduce) {
    this.flowerIntroduce = flowerIntroduce;
  }


  public long getStateId() {
    return stateId;
  }

  public void setStateId(long stateId) {
    this.stateId = stateId;
  }

  public Flowertype getFlowertype() {
    return flowertype;
  }

  public void setFlowertype(Flowertype flowertype) {
    this.flowertype = flowertype;
  }

  public Floweruse getFloweruse() {
    return floweruse;
  }

  public void setFloweruse(Floweruse floweruse) {
    this.floweruse = floweruse;
  }

  public Flowerbranchnumber getFlowerbranchnumber() {
    return flowerbranchnumber;
  }

  public void setFlowerbranchnumber(Flowerbranchnumber flowerbranchnumber) {
    this.flowerbranchnumber = flowerbranchnumber;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public int getSkip() {
    return skip;
  }

  public void setSkip(int skip) {
    this.skip = skip;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return "Flower{" +
            "flowerId=" + flowerId +
            ", flowerTypeId=" + flowerTypeId +
            ", flowerUseId=" + flowerUseId +
            ", flowerBranchNumberId=" + flowerBranchNumberId +
            ", flowerMarketPrice=" + flowerMarketPrice +
            ", flowerPrice=" + flowerPrice +
            ", flowerInventory=" + flowerInventory +
            ", flowerImageName='" + flowerImageName + '\'' +
            ", flowerName='" + flowerName + '\'' +
            ", flowerDateTime=" + flowerDateTime +
            ", flowerMaterials='" + flowerMaterials + '\'' +
            ", flowerPackaging='" + flowerPackaging + '\'' +
            ", flowerLanguage='" + flowerLanguage + '\'' +
            ", flowerIntroduce='" + flowerIntroduce + '\'' +
            ", stateId=" + stateId +
            ", flowertype=" + flowertype +
            ", floweruse=" + floweruse +
            ", flowerbranchnumber=" + flowerbranchnumber +
            ", state=" + state +
            ", skip=" + skip +
            ", size=" + size +
            '}';
  }
}
