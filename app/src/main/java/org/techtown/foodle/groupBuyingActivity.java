package org.techtown.foodle;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class groupBuyingActivity extends AppCompatActivity {

    ListView listView;
    @Override protected void onResume() {
        super.onResume();
    }
    static final String[] LIST_MENU = {"LIST1", "LIST2", "LIST3", "LIST4", "LIST5", "LIST6", "LIST7", "LIST8", "LIST9"} ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.groupbuying_main);

        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, LIST_MENU) ;

        ListView listview;
        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);

        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.water_resize),
                " [제주 삼다수]\n 생수 2L 20개 묶음", " 인원: 23명/50명 | 가격: 370원/개") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sparking_resize),
                " [빅토리아]\n 탄산수 500ml 10개 묶음", " 인원: 44명/50명 | 가격: 890원/개") ;
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.honey_resize),
                " [지리산한봉영농조합]\n 지리산 꿀 2종 300ml 10개 묶음", " 인원: 17명/20명 | 가격: 12,880원/개") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.cheese_resize),
                " [서울우유]\n 어린이 고칼슘 치즈 20개 묶음", " 인원: 17명/40명 | 가격: 2,320원/개") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.hotdog_resize),
                " [고메]\n 올바른 핫도그 5개입 10개 묶음", " 인원: 7명/25명 | 가격: 4,200원/개") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.olive_resize),
                " [델파파]\n 퓨어 올리브유 1L 5개 묶음", " 인원: 4명/15명 | 가격: 9,980원/개p") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.rice_resize),
                " 상품: 우리가족 살맛나는 쌀\n 20kg 10개 묶음", " 인원: 6명/10명 | 가격: 54,000원/개") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.yogurt_resize),
                " [서울우유]\n 요거트 65ml 20개입 20개 묶음", " 인원: 47명/50명 | 가격: 2,240원/개") ;


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                // get item
                ListViewItemGroup item = (ListViewItemGroup) parent.getItemAtPosition(position) ;

                String titleStr = item.getTitle() ;
                String descStr = item.getDesc() ;
                Drawable iconDrawable = item.getIcon() ;

                // TODO : use item data.
            }
        }) ;
    }
}

