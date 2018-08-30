package com.mustafaturkyilmaz.mynotes;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    TextView textViewLogo;
    Typeface typefaceLogo;
    EditText editTextUserName;
    EditText editTextPassword;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        typefaceLogo=Typeface.createFromAsset(getAssets(),"fonts/Billabong.ttf");
        TextView textViewLogo=(TextView)findViewById(R.id.textViewLogo);
        textViewLogo.setTypeface(typefaceLogo);
        editTextUserName=(EditText)findViewById(R.id.editTextUserName);
        editTextPassword=(EditText)findViewById(R.id.editTextPassword);
        buttonLogin=(Button)findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName=editTextUserName.getText().toString();
                String userPassword=editTextPassword.getText().toString();
                if ("admin".equals(userName)&&"1234".equals(userPassword)){
                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                }else {
                    Toast.makeText(getApplicationContext(),"HATALI GİRİŞ...!!!",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
