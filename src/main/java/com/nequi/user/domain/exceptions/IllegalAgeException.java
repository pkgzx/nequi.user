package com.nequi.user.domain.exceptions;

public class IllegalAgeException extends RuntimeException {
  public IllegalAgeException(String message) {
    super(message);
  }
}
