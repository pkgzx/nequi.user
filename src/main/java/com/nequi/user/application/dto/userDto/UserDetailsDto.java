package com.nequi.user.application.dto.userDto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.nequi.user.domain.models.Role;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDetailsDto {
  private String id;

  private String phone;

  private String email;

  private String password;

  private String documentType;

  private String documentNumber;

  private String firstName;

  private String lastName;

  private LocalDate birthDate;

  private String gender;

  private String status;

  private Role role;

  private LocalDateTime createdAt;

  private LocalDateTime updatedAt;
}
