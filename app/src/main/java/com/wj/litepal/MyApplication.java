package com.wj.litepal;

import org.litepal.LitePal;
import org.litepal.LitePalApplication;

/**
 * Created by Hannah on 2018/6/14.
 */

public class MyApplication extends LitePalApplication {
  @Override
  public void onCreate() {
    super.onCreate();
    //初始化
    LitePal.initialize(this);
  }
}
