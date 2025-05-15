package com.nequi.user.domain.exceptions;

public class PermissionNotFoundException extends RuntimeException {
  public PermissionNotFoundException(String message) {
    super(message);
  }
}
