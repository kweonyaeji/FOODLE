package org.techtown.foodle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ContractAgree extends AppCompatActivity {

    Button btn_login2;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contract_agree_main);

        btn_login2 = (Button) findViewById(R.id.btn_login2);

        btn_login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContractAgree.this, UserInputInfo.class);
                startActivity(intent);

            }
        });

    }
}
