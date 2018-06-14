package com.wj.litepal;

import android.content.ContentValues;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import java.util.List;
import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

public class MainActivity extends AppCompatActivity {

  private Context context;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    context = this;

    addUser();
    queryUser();
    Log.v("LitePal Log", "*******************************");
    updateUser();
    queryUser();
    Log.v("LitePal Log", "*******************************");
    deleteUser();
    queryUser();
    Log.v("LitePal Log", "*******************************");
    countUser();
  }

  /**
   * 添加用户
   */
  private void addUser() {
    //方式一
    ContentValues values = new ContentValues();
    values.put("name", "WJ 3");
    //values.put("age", "18");
    long l = LitePal.getDatabase().insert("User", "", values);
    Log.v("LitePal Log", "插入成功 : " + l);

    //方式二
    User user = new User();
    user.setName("WJ 4");
    //user.setAge("20");
    //返回是否插入成功的boolean值 不会打印错误日志
    boolean save = user.save();
    Log.v("LitePal Log", "插入成功 : " + save);
    //会打印出出错日志
    user.saveThrows();
  }

  /**
   * 查询用户
   */
  private void queryUser() {
    List<User> all = DataSupport.findAll(User.class);
    for (User u : all) {
      Log.v("LitePal Log", "查询：Name:" + u.getName() /*+ " Age:" + u.getAge()*/);
    }
  }

  /**
   * 更新用户
   */
  private void updateUser() {
    ContentValues values = new ContentValues();
    values.put("name", "WJ Hannah");
    DataSupport.update(User.class, values, 2);
  }

  /**
   * 删除用户
   */
  private void deleteUser() {
    int delete = DataSupport.delete(User.class, 2);
    Log.v("LitePal Log", "删除：" + delete);
  }

  private void countUser() {
    int count = DataSupport.count(User.class);
    Log.v("LitePal Log", "Count：" + count);
  }
}
