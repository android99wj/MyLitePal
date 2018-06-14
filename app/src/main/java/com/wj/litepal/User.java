package com.wj.litepal;

import org.litepal.crud.DataSupport;

/**
 * Created by Hannah on 2018/6/14.
 */

public class User extends DataSupport{
  private String name;
  private String age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }
}
