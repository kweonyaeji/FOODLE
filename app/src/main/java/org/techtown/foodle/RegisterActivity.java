package org.techtown.foodle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {

    Pattern emailPatttern = Patterns.EMAIL_ADDRESS;
    Button btn_register;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button btn_idck;
        Button btn_emck;
        btn_emck = (Button) findViewById(R.id.btn_emck_chef);
        btn_idck = (Button) findViewById(R.id.btn_idck_chef);
        final TextView id_alert = findViewById(R.id.id_alert_chef);
        final TextView email_alert = findViewById(R.id.email_alert_chef);
        //final EditText join_email = findViewById(R.id.join_email);
        btn_idck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id_alert.setText("* 사용가능한 아이디입니다");
            }
        });


        btn_emck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email_alert.setText("* 사용가능한 이메일입니다");
            }
        });

        /*if(!emailPatttern.matcher(join_email.getText().toString()).matches()){
            email_alert.setText("* 이메일 형식이 올바르지 않습니다");
            join_email.requestFocus();
            return;
        }*/

        btn_register = (Button) findViewById(R.id.btn_register_chef);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, PublicMain.class);
                startActivity(intent);

            }
        });


    }
}
