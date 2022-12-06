package org.techtown.foodle;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class LastFoodleActivity extends AppCompatActivity {
    ListView listView;
    @Override protected void onResume() {
        super.onResume();
    }
    static final String[] LIST_MENU = {"LIST1", "LIST2", "LIST3", "LIST4", "LIST5", "LIST6", "LIST7", "LIST8", "LIST9"} ;


    ImageButton btn_write;
    Button btn_put;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lastfoodle_main);
        btn_write = (ImageButton) findViewById(R.id.btn_write);
        btn_put = (Button) findViewById(R.id.btn_put);
        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, LIST_MENU) ;


        btn_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LastFoodleActivity.this, LastFoodleWrite.class);
                startActivity(intent);

            }
        });

        btn_put.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LastFoodleActivity.this, LastFoodleDetailPage.class);
                startActivity(intent);

            }
        });
        ListView listview;
        LastListViewAdapter adapter;

        // Adapter 생성
        adapter = new LastListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.lastlist);
        listview.setAdapter(adapter);

        // 첫 번째 아이템 추가.
        adapter.addItem("참맛감자탕", "130m",
                ContextCompat.getDrawable(this, R.drawable.bonesoup_resize),
                "뼈해장국", "정가: 9,000원","→ 할인가: 6,500원") ;
        adapter.addItem("홍가네 부대찌개", "383m",
                ContextCompat.getDrawable(this, R.drawable.armysoup_resize),
                "우삼겹 부대세트", "정가:23,000원","→ 할인가: 17,000원") ;
        adapter.addItem("뚜레쥬르", "424m",
                ContextCompat.getDrawable(this, R.drawable.scon_resize),
                "스콘 4종세트", "정가: 8,700원","→ 할인가: 3,600원") ;
        adapter.addItem("고봉민김밥", "887m",
                ContextCompat.getDrawable(this, R.drawable.kimbab_resize),
                "참치치즈김밥 & 유부초밥", "정가: 9,000원","→ 할인가: 6,000원") ;
        adapter.addItem("매일파스파", "276m",
                ContextCompat.getDrawable(this, R.drawable.pasta_resize),
                "알리오올리오", "정가: 12,000원","→ 할인가: 7,000원") ;
        adapter.addItem("파리바게트", "973m",
                ContextCompat.getDrawable(this, R.drawable.bread_resize),
                "정통우유식빵", "정가: 4,500원","→ 할인가: 2,000원") ;




        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                // get item
                ListViewItemGroup item = (ListViewItemGroup) parent.getItemAtPosition(position) ;

                String nameStr = item.getDesc();
                String posStr = item.getDesc();
                Drawable iconDrawable = item.getIcon() ;
                String titleStr = item.getTitle() ;
                String desc1Str = item.getDesc() ;
                String desc2Str = item.getDesc() ;


                // TODO : use item data.
            }
        }) ;
    }
}
