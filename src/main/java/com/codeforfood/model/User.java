package com.codeforfood.model;

public class User {

  private String email;
  private String password;
  private boolean isConfirmed;

  public User(String email, String password) {
    this.email = email;
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public boolean isConfirmed() {
    return isConfirmed;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setConfirmed(boolean confirmed) {
    isConfirmed = confirmed;
  }
}
