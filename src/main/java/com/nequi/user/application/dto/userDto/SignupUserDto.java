package com.nequi.user.application.dto.userDto;

import java.time.LocalDate;

import com.nequi.user.domain.utils.Constants;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SignupUserDto {

  @NotBlank(message = Constants.MSG_REQUIRED_PHONE)
  @Pattern(regexp = Constants.REGEXP_PHONE, message = Constants.MSG_INVALID_PHONE)
  private String phone;

  @NotBlank(message = Constants.MSG_REQUIRED_EMAIL)
  @Email(message = Constants.MSG_INVALID_EMAIL)
  private String email;

  @NotBlank(message = Constants.MSG_REQUIRED_PASSWORD)
  @Pattern(regexp = Constants.REGEXP_PASSWORD, message = Constants.MSG_INVALID_PASSWORD)
  private String password;

  @NotBlank(message = Constants.MSG_REQUIRED_DOCUMENT_TYPE)
  private String documentType;

  @NotBlank(message = Constants.MSG_REQUIRED_DOCUMENT_NUMBER)
  private String documentNumber;

  @NotBlank(message = Constants.MSG_REQUIRED_FIRST_NAME)
  private String firstName;

  @NotBlank(message = Constants.MSG_REQUIRED_LAST_NAME)
  private String lastName;

  @NotNull(message = Constants.MSG_REQUIRED_BIRTH_DATE)
  private LocalDate birthDate;

  @Null
  private String gender;
}
