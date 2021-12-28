package org.techtown.foodle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Welcome_5 extends AppCompatActivity {

    Button button_5;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_slide5);

        button_5 = (Button) findViewById(R.id.button_5);


        /*button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome_5.this, MainActivity.class);
                startActivity(intent);

                //overridePendingTransition(R.anim.fadein, R.anim.fadeout);

            }
        });*/

    }
}