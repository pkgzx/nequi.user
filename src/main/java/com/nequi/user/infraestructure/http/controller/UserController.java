package com.nequi.user.infraestructure.http.controller;

import com.nequi.user.application.dto.userDto.SignupUserDto;
import com.nequi.user.application.dto.userDto.UserDetailsDto;
import com.nequi.user.application.service.IUserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {
  private final IUserService userService;

  @PostMapping
  public ResponseEntity<UserDetailsDto> signup(@Valid @RequestBody SignupUserDto dto) {
    UserDetailsDto response = userService.registerUser(dto);
    return new ResponseEntity<>(response, HttpStatus.CREATED);
  }

}
