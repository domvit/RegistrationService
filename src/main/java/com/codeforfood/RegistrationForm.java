package com.codeforfood;

import javax.validation.constraints.Pattern;

public class RegistrationForm {

  @Pattern(regexp = "\".+@.+\\\\..+\"", message = "Wrong email!")
  private String email;

  @Pattern(regexp = "", message = "Password should contain at least two numbers and one exclamation mark!")
  private String password;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
