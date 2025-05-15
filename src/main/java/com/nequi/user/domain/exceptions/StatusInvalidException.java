package com.nequi.user.domain.exceptions;

public class StatusInvalidException extends RuntimeException {
  public StatusInvalidException(String message) {
    super(message);
  }
}
