package org.techtown.foodle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LastFoodleDetailPage extends AppCompatActivity {

    Button btn_reserve;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lastfoodle_detailpage);

        btn_reserve = (Button) findViewById(R.id.btn_reserve);

        btn_reserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LastFoodleDetailPage.this, LastFoodleReserve.class);
                startActivity(intent);

            }
        });
    }
}
