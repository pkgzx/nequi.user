package com.nequi.user.application.service;

import com.nequi.user.application.dto.userDto.SignupUserDto;
import com.nequi.user.application.dto.userDto.UserDetailsDto;
import com.nequi.user.application.mapper.userMapper.IUserMapper;
import com.nequi.user.domain.model.User;
import com.nequi.user.domain.spi.IUserDAO;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService implements IUserService {
  private final IUserMapper userMapper;
  private final IUserDAO userDao;

  @Override
  public UserDetailsDto registerUser(SignupUserDto userData) {
    User user = userMapper.registerUserDtoToUser(userData);
    User userSaved = userDao.saveUser(user);
    return userMapper.userToUserDetailsDto(userSaved);
  }

}
