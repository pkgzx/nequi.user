package com.nequi.user.domain.exception;

public class PermissionNotFoundException extends RuntimeException {
  public PermissionNotFoundException(String message) {
    super(message);
  }
}
