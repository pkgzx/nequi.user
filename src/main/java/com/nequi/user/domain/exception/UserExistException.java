package com.nequi.user.domain.exception;

public class UserExistException extends RuntimeException {
  public UserExistException(String message) {
    super(message);
  }
}
