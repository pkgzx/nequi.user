package com.nequi.user.domain.spi;

public interface IAgeDAO {

  /**
   * param countryCode get legal age by country Alpha-2 code ISO 3166
   * {@link https://www.iban.com/country-codes}
   */
  Integer getLegalAgeByCountry(String countryCode);
}
