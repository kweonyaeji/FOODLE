package org.techtown.foodle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Welcome_3 extends AppCompatActivity {

    Button button_3;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_slide3);

        button_3 = (Button) findViewById(R.id.button_3);


        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome_3.this, Welcome_4.class);
                startActivity(intent);

                overridePendingTransition(R.anim.fadein, R.anim.fadeout);

            }
        });

    }
}