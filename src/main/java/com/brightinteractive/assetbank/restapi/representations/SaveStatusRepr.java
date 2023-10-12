package com.brightinteractive.assetbank.restapi.representations;

import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * Serializable info about the status of a resource that has been saved.
 * status is a string providing information about the status of the save, for example see DocumentUpdateStatus
 * message is intended to contain error text to be displayed to the user in the case of "fail".
 * <p>
 * <p>
 * Eg
 * <p>
 * {
 * "status": "successful",
 * "message": ""
 * }
 *
 * @author Bright
 */
@javax.xml.bind.annotation.XmlRootElement(name = "saveStatus")
@XmlRootElement(name = "saveStatus")
public class SaveStatusRepr {

  private static final String k_sSuccess = "Success";
  private static final String k_sFailure = "Failure";
  private static final String k_sPending = "Pending";

  public String status;
  public String message;

  public static SaveStatusRepr success() {
    return new SaveStatusRepr(k_sSuccess, "");
  }

  public static SaveStatusRepr pending() {
    return new SaveStatusRepr(k_sPending, "");
  }

  public static SaveStatusRepr failure(String a_sMessage) {
    return new SaveStatusRepr(k_sFailure, a_sMessage);
  }

  public static SaveStatusRepr failure() {
    return new SaveStatusRepr(k_sFailure, "");
  }

  public SaveStatusRepr() {
  }

  public SaveStatusRepr(String a_status, String a_message) {
    status = a_status;
    message = a_message;
  }

  public boolean equals(SaveStatusRepr a_compareTo) {
    if (a_compareTo.status.equals(this.status)) {
      return true;
    }

    return false;
  }
}
