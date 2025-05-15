package com.nequi.user.domain.models;

public class Phone {
  private Integer countryPrefix;
  private String digits;

  public Phone(Integer countryPrefix, String digits) {
    this.countryPrefix = countryPrefix;
    this.digits = digits;
  }

  public String getDigits() {
    return digits;
  }

  public Integer getCountryPrefix() {
    return countryPrefix;
  }

  public void setDigits(String digits) {
    this.digits = digits;
  }

  public void setCountryPrefix(Integer countryPrefix) {
    this.countryPrefix = countryPrefix;
  }

  @Override
  public String toString() {
    return String.format("""
        {
          countryPrefix: %d,
          digits: %s
        }
        """, countryPrefix, digits);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + countryPrefix;
    result = prime * result + ((digits == null ? 0 : digits.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Phone other = (Phone) obj;
    if (countryPrefix != other.getCountryPrefix())
      return false;
    if (digits == null) {
      if (other.getDigits() != null) {
        return false;
      }
    } else if (!digits.equals(other.getDigits()))
      return false;
    return true;
  }
}
