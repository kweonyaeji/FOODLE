package org.techtown.foodle;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LastFoodleReserve extends AppCompatActivity {

    Button btn_reserved;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lastfoodle_reserve);


        btn_reserved = (Button) findViewById(R.id.btn_reserved);

        btn_reserved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(LastFoodleReserve.this, MyPage.class);
                startActivity(intent);*/

                showDialog();

            }
        });
    }

    void showDialog() {
        AlertDialog.Builder msgBuilder = new AlertDialog.Builder(LastFoodleReserve.this)
                .setTitle("예약 상세 내용 확인")
                .setMessage("닉네임: 고독한양파\n상품명: 뼈해장국\n수량:1개\n시간:20시 40분\n")
                .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(LastFoodleReserve.this, MyPage.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(LastFoodleReserve.this, "내용 입력", Toast.LENGTH_SHORT).show();
                    }
                });
        AlertDialog msgDlg = msgBuilder.create();
        msgDlg.show();
    }

}
