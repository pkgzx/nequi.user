package com.nequi.user.domain.spi;

public interface IPhoneDAO {
  String getISOCodeByCountryPrefix(Integer countryPrefix);
}
