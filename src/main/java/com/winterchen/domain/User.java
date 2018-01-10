package com.winterchen.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;

/**
 * User实体映射类
 * Created by Administrator on 2017/11/24.
 */
@Data
@ToString
public class User {

  private Integer id;
  private String name;
  private String password;
  private String phone;
  @Column(nullable = false)
  private Integer age;

  //省略 get 和 set ...

  public Integer getId() {
    return id;
  }

  public void setId(Integer userId) {
    this.id = userId;
  }

  public String getName() {
    return name;
  }

  public void setName(String userName) {
    this.name = userName == null ? null : userName.trim();
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password == null ? null : password.trim();
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone == null ? null : phone.trim();
  }

  public void setAge(Integer age){this.age=age;}

  public Integer getAge(){return age;}

  public User(){

  }
  public User(String name,Integer age){
      this.name=name;
      this.age=age;
  }
}