package com.nequi.user.domain.model;

public class Permission {
  private Long id;
  private String name;
  private String description;

  public Permission(Long id, String name, String description) {
    this.id = id;
    this.name = name;
    this.description = description;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  @Override
  public String toString() {
    return "Permission{" +
        "id='" + id + "\'" +
        ", name='" + name + "\'" +
        ", description='" + description + "\'" +
        "}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Permission))
      return false;

    Permission permission = (Permission) o;

    if (!id.equals(permission.id))
      return false;
    if (!name.equals(permission.name))
      return false;
    return description.equals(permission.description);
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + name.hashCode();
    result = 31 * result + description.hashCode();
    return result;
  }
}
