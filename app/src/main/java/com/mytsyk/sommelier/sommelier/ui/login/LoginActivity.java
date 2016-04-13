package com.mytsyk.sommelier.sommelier.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mytsyk.sommelier.sommelier.R;
import com.mytsyk.sommelier.sommelier.ui.home.HomeActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText etLogin;
    private EditText etPassword;
    private Button btnSignIn;
    private TextInputLayout tilPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        btnSignIn.setOnClickListener(signInListener);
    }

    private void initView(){
        etLogin=(EditText)findViewById(R.id.activity_login_et_login);
        etPassword=(EditText)findViewById(R.id.activity_password_et_password);
        btnSignIn=(Button)findViewById(R.id.activity_login_btn_sign_in);
        tilPassword =(TextInputLayout)findViewById(R.id.activity_login_input_layout_password);
    }

    private View.OnClickListener signInListener= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(etPassword.getText().toString().equals("11111")){
                Intent homeActivity= new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(homeActivity);
                finish();
            } else {
                tilPassword.setError("wrong login or password");
            }


        }
    };
}
