package com.test.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    EditText id , password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id=findViewById(R.id.textView2);
        password=findViewById(R.id.editTextNumberPassword);

    }
    public void run1(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,Inputinfor.class);
        startActivity(intent);
    }
    public void run(View vv){
        UserManager rateManager = new UserManager(this);
        List<Useritem> list = rateManager.listAll();
        String id1 = id.getText().toString();
        String pwd=password.getText().toString();

        if(TextUtils.isEmpty(id1)||TextUtils.isEmpty(pwd)){
            Toast.makeText(MainActivity.this,"请输入账号或密码",Toast.LENGTH_LONG).show();
            Log.i(TAG, "run: zzz");
        }else if(id1.equals("999999")&&pwd.equals("999999")){
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,Adamin1.class);
            startActivity(intent);
        }else{
            int i = 0;
            for (Useritem item : list) {
                if(id1.equals(item.getStudentid())&&pwd.equals(item.getPassword())){
                    i=i+1;
                    Log.i(TAG, "run: item.id=" + item.getId());
                    Log.i(TAG, "run: item.name=" + item.getName());
                    Log.i(TAG, "run: 222");
                }
            }
            if(i>0){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,UserActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(MainActivity.this, "账号或者密码不正确", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "run: 333");
            }

        }

    }

}