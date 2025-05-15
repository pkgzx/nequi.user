package com.nequi.user.domain.exception;

public class StatusInvalidException extends RuntimeException {
  public StatusInvalidException(String message) {
    super(message);
  }
}
