package com.brightinteractive.assetbank.restapi.representations;

/**
 * Used for sending messages and their type between Applet threads
 *
 * @author Dean Barnes
 */
public class UIMessage {
  private String message;
  private UIMessageType messageType;

  // Used for serialization
  public UIMessage() {
  }

  public UIMessage(String message, UIMessageType messageType) {
    this.message = message;
    this.messageType = messageType;
  }

  // Used for serialization
  public void setMessage(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  // Used for serialization
  public void setMessageType(UIMessageType messageType) {
    this.messageType = messageType;
  }

  // Used for serialization
  public UIMessageType getMessageType() {
    return messageType;
  }

  public boolean isPlainMessage() {
    return messageType == UIMessageType.PLAIN;
  }

  public boolean isWarningMessage() {
    return messageType == UIMessageType.WARNING;
  }

  public boolean isErrorMessage() {
    return messageType == UIMessageType.ERROR;
  }
}
