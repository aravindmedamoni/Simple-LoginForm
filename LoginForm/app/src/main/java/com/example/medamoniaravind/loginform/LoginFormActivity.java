package com.example.medamoniaravind.loginform;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginFormActivity extends AppCompatActivity {
 EditText useret;
 EditText passet;
 SharedPreferences prefer;
 String a,b;
 String username,passewrd;
 String uname,upass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        useret=findViewById(R.id.username);
        passet=findViewById(R.id.pwd);
         a=useret.getText().toString();
         b=passet.getText().toString();
        prefer=getSharedPreferences("share",MODE_PRIVATE);
         username=prefer.getString("username",null);
         passewrd=prefer.getString("password",null);
         Log.d("SharedData",username+"/n"+passewrd);


    }

    public void loginbtn(View view){
        uname = useret.getText().toString();
        upass = passet.getText().toString();
        Log.d("EditTextData",uname+"/n"+upass);
         if (uname.equals(username) && passewrd.equals(upass)){
            Intent i=new Intent(LoginFormActivity.this,LocationActivity.class);
            i.putExtra("u",a);
            i.putExtra("p",b);
            startActivity(i);
        }else {
            Toast.makeText(LoginFormActivity.this, "Please enter valid credentials", Toast.LENGTH_SHORT).show();
        }


    }

    public void forgotpwd(View view){
        Intent i=new Intent(LoginFormActivity.this,ForgotPasswordActivity.class);
        startActivity(i);
    }

    public void rgstrnw(View view){
        Intent i=new Intent(LoginFormActivity.this,RegisterFormActivity.class);
        startActivity(i);
    }

}
