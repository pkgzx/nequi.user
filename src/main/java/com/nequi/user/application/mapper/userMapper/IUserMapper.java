package com.nequi.user.application.mapper.userMapper;

import com.nequi.user.application.dto.userDto.RegisterUserDto;
import com.nequi.user.domain.models.User;

public interface IUserMapper {

  // User to RegisterUserDto
  RegisterUserDto userToRegisterUserDto(User user);

  // RegisterUserDto to User
  User registerUserDtoToUser(RegisterUserDto registerUserDto);

  // User to UserResponseDto
  /*
   * UserResponseDto userToUserResponseDto(User user);
   * 
   * // UserResponseDto to User
   * User userResponseDtoToUser(UserResponseDto userResponseDto);
   * 
   * // User to UpdateUserDto
   * UpdateUserDto userToUpdateUserDto(User user);
   * 
   * // UpdateUserDto to User
   * User updateUserDtoToUser(UpdateUserDto updateUserDto);
   */
}
