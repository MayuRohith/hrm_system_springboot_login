package com.sgic.hrm.commons.dto;

import com.sgic.hrm.commons.enums.Status;

public class CancelLeaveRequestData {

  private Integer id;
  private LeaveRequestData leaveRequest;
  private String reason;
  private Status status;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LeaveRequestData getLeaveRequest() {
    return leaveRequest;
  }

  public void setLeaveRequest(LeaveRequestData leaveRequest) {
    this.leaveRequest = leaveRequest;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

}
