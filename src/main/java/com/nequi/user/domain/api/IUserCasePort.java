package com.nequi.user.domain.api;

import com.nequi.user.domain.model.User;

public interface IUserCasePort {
  User registerUser(User userData);
}
