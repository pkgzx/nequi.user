package com.nequi.user.domain.useCase;

import java.time.LocalDate;
package com.nequi.user.domain.useCase;

import java.time.LocalDate;

import com.nequi.user.domain.api.IUserCasePort;
import com.nequi.user.domain.exceptions.IllegalAgeException;
import com.nequi.user.domain.models.User;
import com.nequi.user.domain.spi.IAgeDAO;
import com.nequi.user.domain.spi.IPhoneDAO;
import com.nequi.user.domain.spi.IUserDAO;
import com.nequi.user.domain.utils.Constants;

public class UserUseCase implements IUserCasePort {
  private final IUserDAO userDao;
  private final IAgeDAO ageDao;
  private final IPhoneDAO phoneDao;

  public UserUseCase(IUserDAO userDao, IAgeDAO ageDao, IPhoneDAO phoneDao) {
    this.userDao = userDao;
    this.ageDao = ageDao;
    this.phoneDao = phoneDao;
  }

  @Override
  public User registerUser(User userData) {
    validateUser(userData);
    return this.userDao.saveUser(userData);
  }

  private void validateUser(User user) {
    final String isoCodeCountry = phoneDao.getISOCodeByCountryPrefix(user.getPhone().getCountryPrefix());

    if (LocalDate.now().minusYears(ageDao.getLegalAgeByCountry(isoCodeCountry)).isBefore(user.getBirth())) {
      throw new IllegalAgeException(Constants.MSG_ILLEGAL_USER_AGE);
    }
  }

}
