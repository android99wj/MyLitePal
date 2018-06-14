package com.wj.litepal;

import org.litepal.crud.DataSupport;

/**
 * Created by Hannah on 2018/6/14.
 */

public class User extends DataSupport{
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
