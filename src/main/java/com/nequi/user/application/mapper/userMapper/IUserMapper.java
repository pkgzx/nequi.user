package com.nequi.user.application.mapper.userMapper;

import com.nequi.user.application.dto.userDto.SignupUserDto;
import com.nequi.user.application.dto.userDto.UserDetailsDto;
import com.nequi.user.domain.model.User;

public interface IUserMapper {

  // RegisterUserDto to User
  User registerUserDtoToUser(SignupUserDto registerUserDto);

  // User to UserDetailsDto
  UserDetailsDto userToUserDetailsDto(User user);
}
