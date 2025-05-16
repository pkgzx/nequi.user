package com.nequi.user.domain.spi;

import java.util.List;

import com.nequi.user.domain.model.User;

public interface IUserDAO {
  User saveUser(User userData);

  User getUser();

  boolean existUserByDNI(String dni);

  boolean existUserByEmail(String email);

  List<User> getUsers();

  void deleteUser();

  User updateUser();
}
