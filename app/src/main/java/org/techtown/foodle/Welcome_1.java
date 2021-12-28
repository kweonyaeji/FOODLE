package org.techtown.foodle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Welcome_1 extends AppCompatActivity {

    Button button_1;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_slide1);

        button_1 = (Button) findViewById(R.id.button_1);


        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome_1.this, Welcome_2.class);
                startActivity(intent);

                overridePendingTransition(R.anim.fadein, R.anim.fadeout);

            }
        });

    }
}
