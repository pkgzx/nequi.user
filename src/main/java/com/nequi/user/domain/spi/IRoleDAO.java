package com.nequi.user.domain.spi;

import com.nequi.user.domain.model.Role;

import java.util.List;
import java.util.Optional;

public interface IRoleDAO {
  Role saveRole(Role roleData);

  Optional<Role> getRole(String id);

  List<Role> getRoles();

  void deleteRole();

  Role updateRole();
}
