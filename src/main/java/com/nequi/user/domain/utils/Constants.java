package com.nequi.user.domain.utils;

public interface Constants {
  String MSG_ILLEGAL_USER_AGE = "User must be of legal age";
  String MSG_INVALID_PHONE = "Phone number is invalid";
  String MSG_INVALID_EMAIL = "Email is invalid";
  String MSG_INVALID_DOCUMENT_TYPE = "Document type is invalid";
  String MSG_INVALID_DOCUMENT_NUMBER = "Document number is invalid";
  String MSG_INVALID_FIRST_NAME = "First name is invalid";
  String MSG_INVALID_LAST_NAME = "Last name is invalid";
  String MSG_INVALID_PASSWORD = "Password is invalid";
  String MSG_REQUIRED_PHONE = "Phone number is required";
  String MSG_REQUIRED_EMAIL = "Email is required";
  String MSG_REQUIRED_PASSWORD = "Password is required";
  String MSG_REQUIRED_DOCUMENT_TYPE = "Document type is required";
  String MSG_REQUIRED_DOCUMENT_NUMBER = "Document number is required";
  String MSG_REQUIRED_FIRST_NAME = "First name is required";
  String MSG_REQUIRED_LAST_NAME = "Last name is required";
  String MSG_REQUIRED_BIRTH_DATE = "Birth date is required";
  String REGEXP_PHONE = "^\\+?[0-9]{1,3}?[0-9]{4,14}$";
  String REGEXP_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$"; // At least 8
                                                                                                     // characters, 1
                                                                                                     // uppercase
                                                                                                     // letter, 1
                                                                                                     // lowercase
                                                                                                     // letter, 1 number
                                                                                                     // and 1 special
                                                                                                     // character
  Integer LEGAL_USER_AGE = 18;

}
