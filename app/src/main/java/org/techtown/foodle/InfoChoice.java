package org.techtown.foodle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class InfoChoice extends AppCompatActivity {

    Button choice_person;
    Button choice_chef;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_choice);

        choice_person = (Button) findViewById(R.id.choice_person);
        choice_chef = (Button) findViewById(R.id.choice_chef);

        choice_person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoChoice.this, RegisterActivity.class);
                startActivity(intent);

            }
        });

        choice_chef.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(InfoChoice.this, RegisterActivity.class);
                startActivity(intent);

            }
        });

    }
}