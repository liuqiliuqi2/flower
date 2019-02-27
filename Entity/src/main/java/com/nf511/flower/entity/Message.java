package com.nf511.flower.entity;


public class Message {

  private long messageId;
  private long senderId;
  private long recipientId;


  public long getMessageId() {
    return messageId;
  }

  public void setMessageId(long messageId) {
    this.messageId = messageId;
  }


  public long getSenderId() {
    return senderId;
  }

  public void setSenderId(long senderId) {
    this.senderId = senderId;
  }


  public long getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(long recipientId) {
    this.recipientId = recipientId;
  }

}
