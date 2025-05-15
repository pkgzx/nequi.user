package com.nequi.user.domain.model;

import java.util.Optional;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class User {
  private String id;
  private Phone phone;
  private String email;
  private String password;
  private String documentType;
  private String documentNumber;
  private String firstName;
  private String lastName;
  private Optional<String> gender;
  private String status;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private LocalDate birth;
  private Role role;

  public User(String id, Phone phone, String email, String password, String documentType, String documentNumber,
      String firstName,
      String lastName, Optional<String> gender, String status, LocalDateTime createdAt, LocalDateTime updatedAt,
      LocalDate birth, Role role) {
    this.id = id;
    this.phone = phone;
    this.email = email;
    this.password = password;
    this.documentType = documentType;
    this.documentNumber = documentNumber;
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.status = status;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.birth = birth;
    this.role = role;
  }

  public User() {
  }

  public String getId() {
    return this.id;
  }

  public Phone getPhone() {
    return phone;
  }

  public String getEmail() {
    return this.email;
  }

  public String getDocumentType() {
    return this.documentType;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public Optional<String> getGender() {
    return this.gender;
  }

  public String getStatus() {
    return this.status;
  }

  public LocalDateTime getCreatedAt() {
    return this.createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return this.updatedAt;
  }

  public LocalDate getBirth() {
    return this.birth;
  }

  public String getDocumentNumber() {
    return this.documentNumber;
  }

  public Role getRole() {
    return this.role;
  }

  public void setPhone(Phone phone) {
    this.phone = phone;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setGender(Optional<String> gender) {
    this.gender = gender;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setBirth(LocalDate birth) {
    this.birth = birth;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return "User{" +
        "id='" + this.id + "\'" +
        ", phoneNumber=' +" + this.phone.getCountryPrefix() + "-" + this.phone.getDigits() + "\'" +
        ", email='" + this.email + "\'" +
        ", documentType='" + this.documentType + "\'" +
        ", documentNumber='" + this.documentNumber + "\'" +
        ", firstName='" + this.firstName + "\'" +
        ", lastName='" + this.lastName + "\'" +
        ", gender='" + this.gender + "\'" +
        ", status='" + this.status + "\'" +
        ", createdAt=" + this.createdAt +
        ", updatedAt=" + this.updatedAt +
        ", birth=" + this.birth +
        ", role=" + this.role +
        "}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof User user))
      return false;

    if (!this.id.equals(user.id))
      return false;
    if (!this.phone.equals(user.phone))
      return false;
    if (!this.email.equals(user.email))
      return false;
    if (!this.documentType.equals(user.documentType))
      return false;
    if (!this.documentNumber.equals(user.documentNumber))
      return false;
    if (!this.firstName.equals(user.firstName))
      return false;
    if (!this.lastName.equals(user.lastName))
      return false;
    if (!this.gender.equals(user.gender))
      return false;
    if (!this.status.equals(user.status))
      return false;
    if (!this.createdAt.equals(user.createdAt))
      return false;
    if (!this.birth.equals(user.birth))
      return false;
    if (!this.role.equals(user.role))
      return false;
    return this.updatedAt.equals(user.updatedAt);
  }

  @Override
  public int hashCode() {
    int result = this.id.hashCode();
    result = 31 * result + this.phone.hashCode();
    result = 31 * result + this.email.hashCode();
    result = 31 * result + this.documentType.hashCode();
    result = 31 * result + this.documentNumber.hashCode();
    result = 31 * result + this.firstName.hashCode();
    result = 31 * result + this.lastName.hashCode();
    result = 31 * result + this.gender.hashCode();
    result = 31 * result + this.status.hashCode();
    result = 31 * result + this.createdAt.hashCode();
    result = 31 * result + this.updatedAt.hashCode();
    result = 31 * result + this.birth.hashCode();
    result = 31 * result + this.role.hashCode();
    return result;
  }
}
