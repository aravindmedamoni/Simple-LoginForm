package com.example.medamoniaravind.loginform;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RemoteViewsService;
import android.widget.Toast;


public class RegisterFormActivity extends AppCompatActivity {
    SharedPreferences share;
    SharedPreferences.Editor editor;
    EditText useret;
    EditText emailet;
    EditText phnoet;
    EditText passet;
    EditText cnfmpswdet;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_form);
        useret=findViewById(R.id.name);
        emailet=findViewById(R.id.email);
        phnoet=findViewById(R.id.phno);
        passet=findViewById(R.id.pswd);
        cnfmpswdet=findViewById(R.id.cnfmpswd);
        share=getSharedPreferences("share",MODE_PRIVATE);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.pswd ){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void registerNow(View view){

        String abg=useret.getText().toString();
        String bbn=passet.getText().toString();
        String gvn=emailet.getText().toString();
        String nvg=phnoet.getText().toString();
        String pvn=cnfmpswdet.getText().toString();
        editor=share.edit();
        editor.putString("username",abg);
        editor.putString("password",bbn);
        editor.putString("email",gvn);
        editor.putString("mobilenumber",nvg);
        editor.putString("confirmpassword",pvn);
        editor.commit();
        Toast.makeText(RegisterFormActivity.this, "you registered", Toast.LENGTH_SHORT).show();


    }
}
