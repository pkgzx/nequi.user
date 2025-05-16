package com.nequi.user.application.service;

import com.nequi.user.application.dto.userDto.SignupUserDto;
import com.nequi.user.application.dto.userDto.UserDetailsDto;

public interface IUserService {
  UserDetailsDto registerUser(SignupUserDto userData);
}
