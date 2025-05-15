package com.nequi.user.domain.model;

import java.util.ArrayList;

public class Role {
  private Long id;
  private String name;
  private String description;
  private Iterable<Permission> permissions;

  public Role(Long id, String name, String description, Iterable<Permission> permissions) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.permissions = permissions;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Iterable<Permission> getPermissions() {
    return permissions;
  }

  public void addPermission(Permission permission) {
    if (permissions == null) {
      permissions = new ArrayList<>();
    }
    ((ArrayList<Permission>) permissions).add(permission);
  }

  public void removePermission(Permission permission) {
    if (permissions != null) {
      ((ArrayList<Permission>) permissions).remove(permission);
    }
  }

  @Override
  public String toString() {
    return "Role{" +
        "id=" + id +
        ", name='" + name + "\'" +
        ", description='" + description + "\'" +
        ", permissions=" + permissions +
        "}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Role))
      return false;

    Role role = (Role) o;

    if (!id.equals(role.id))
      return false;
    if (!name.equals(role.name))
      return false;
    if (!permissions.equals(role.permissions))
      return false;
    return description.equals(role.description);
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + name.hashCode();
    result = 31 * result + description.hashCode();
    result = 31 * result + (permissions != null ? permissions.hashCode() : 0);
    return result;
  }
}
