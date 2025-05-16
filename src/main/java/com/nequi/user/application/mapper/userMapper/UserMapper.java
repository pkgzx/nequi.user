package com.nequi.user.application.mapper.userMapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.nequi.user.application.dto.userDto.SignupUserDto;
import com.nequi.user.application.dto.userDto.UserDetailsDto;
import com.nequi.user.domain.model.Permission;
import com.nequi.user.domain.model.Phone;
import com.nequi.user.domain.model.Role;
import com.nequi.user.domain.model.User;

public class UserMapper implements IUserMapper {
  @Override
  public UserDetailsDto userToUserDetailsDto(User user) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public User registerUserDtoToUser(SignupUserDto dto) {
    String[] phoneParts = dto.getPhone().split("-");
    Phone phone = new Phone(
        Integer.parseInt(phoneParts[0]),
        phoneParts[1]);

    List<Permission> permissions = Arrays.asList(
        new Permission(null, "READ", "Read only information"));

    Role role = new Role(null, "CLIENT", "Person that only use nequi to send and receive money", permissions);

    return new User(
        null,
        phone,
        dto.getEmail(),
        dto.getPassword(),
        dto.getDocumentType(),
        dto.getDocumentNumber(),
        dto.getFirstName(),
        dto.getLastName(),
        dto.getGender(),
        "ACTIVATE",
        LocalDateTime.now(),
        LocalDateTime.now(),
        dto.getBirthDate(),
        role);
  }
}
