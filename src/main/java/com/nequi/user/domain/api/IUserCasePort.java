package com.nequi.user.domain.api;

import com.nequi.user.domain.models.User;

public interface IUserCasePort {
  User registerUser(User userData);
}
