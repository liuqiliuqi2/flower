package com.nf511.flower.entity;

public class Orderflower {

  private long orderflowerId;
  private long flowerId;
  private long orderId;
  private long orderFlowerAmount;
  private long cartId;

  private Flower flower;


  public long getOrderflowerId() {
    return orderflowerId;
  }

  public void setOrderflowerId(long orderflowerId) {
    this.orderflowerId = orderflowerId;
  }


  public long getFlowerId() {
    return flowerId;
  }

  public void setFlowerId(long flowerId) {
    this.flowerId = flowerId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getOrderFlowerAmount() {
    return orderFlowerAmount;
  }

  public void setOrderFlowerAmount(long orderFlowerAmount) {
    this.orderFlowerAmount = orderFlowerAmount;
  }

  public Flower getFlower() {
    return flower;
  }

  public void setFlower(Flower flower) {
    this.flower = flower;
  }

  public long getCartId() {
    return cartId;
  }

  public void setCartId(long cartId) {
    this.cartId = cartId;
  }

  @Override
  public String toString() {
    return "Orderflower{" +
            "orderflowerId=" + orderflowerId +
            ", flowerId=" + flowerId +
            ", orderId=" + orderId +
            ", orderFlowerAmount=" + orderFlowerAmount +
            ", cartId=" + cartId +
            ", flower=" + flower +
            '}';
  }
}
