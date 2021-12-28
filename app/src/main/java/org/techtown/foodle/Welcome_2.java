package org.techtown.foodle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Welcome_2 extends AppCompatActivity {

    Button button_2;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_slide2);

        button_2 = (Button) findViewById(R.id.button_2);


        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome_2.this, Welcome_3.class);
                startActivity(intent);

                overridePendingTransition(R.anim.fadein, R.anim.fadeout);

            }
        });

    }
}