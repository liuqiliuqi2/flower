package com.nf511.flower.entity;

public class Collect {

  private long collectId;
  private long flowerId;
  private long userId;

  private Flower flower;


  public long getCollectId() {
    return collectId;
  }

  public void setCollectId(long collectId) {
    this.collectId = collectId;
  }


  public long getFlowerId() {
    return flowerId;
  }

  public void setFlowerId(long flowerId) {
    this.flowerId = flowerId;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public Flower getFlower() {
    return flower;
  }

  public void setFlower(Flower flower) {
    this.flower = flower;
  }

  @Override
  public String toString() {
    return "Collect{" +
            "collectId=" + collectId +
            ", flowerId=" + flowerId +
            ", userId=" + userId +
            ", flower=" + flower +
            '}';
  }
}
