package com.nequi.user.domain.spi;

import com.nequi.user.domain.model.Permission;

import java.util.List;

public interface IPermissionDAO {
  Permission getPerission(Integer permissionId);

  Permission savePermission(Permission permission);

  List<Permission> getPermissions();

  void updatePermission(Permission permission);

  void deletePermission(Integer permissionId);
}
