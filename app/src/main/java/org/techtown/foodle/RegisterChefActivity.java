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

public class RegisterChefActivity extends AppCompatActivity {

    Pattern emailPatttern = Patterns.EMAIL_ADDRESS;
    Button btn_register_chef;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_chef);
        Button btn_idck_chef;
        Button btn_emck_chef;
        btn_idck_chef = (Button) findViewById(R.id.btn_idck_chef);
        btn_emck_chef = (Button) findViewById(R.id.btn_emck_chef);
        final TextView id_alert_chef = findViewById(R.id.id_alert_chef);
        final TextView email_alert_chef = findViewById(R.id.email_alert_chef);
        //final EditText join_email_chef = findViewById(R.id.join_email);
        btn_idck_chef.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                id_alert_chef.setText("* 사용가능한 아이디입니다");
            }
        });

        btn_emck_chef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email_alert_chef.setText("* 사용가능한 이메일입니다");
            }
        });

        /*if(!emailPatttern.matcher(join_email_chef.getText().toString()).matches()){
            email_alert_chef.setText("* 이메일 형식이 올바르지 않습니다");
            join_email_chef.requestFocus();
            return;
        }*/

        btn_register_chef = (Button) findViewById(R.id.btn_register_chef);

        btn_register_chef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterChefActivity.this, PublicMain.class);
                startActivity(intent);

            }
        });


    }
}
