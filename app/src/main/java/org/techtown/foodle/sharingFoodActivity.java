package org.techtown.foodle;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class sharingFoodActivity extends AppCompatActivity {

    ListView listView;
    @Override protected void onResume() {
        super.onResume();
    }
    static final String[] LIST_MENU = {"LIST1", "LIST2", "LIST3", "LIST4", "LIST5", "LIST6", "LIST7", "LIST8", "LIST9"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sharingfood_main);

        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, LIST_MENU) ;

        ListView listview;
        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listview2);
        listview.setAdapter(adapter);

        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.potato_resize),
                "상품: 감자 12개", "자취생 환영, 한개 가능!") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kiwii_resize),
                "상품: 무농약 골드키위 6개", "모두 사실 분만") ;
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.cucumber_resize),
                "상품: 친환경오이 8개", "주부 환영, 두개 부터!") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sweetpotato_resize),
                "상품: 햇 밤고구마 12개", "학생은 한개 보너스로 드려요") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.mandarin_resize),
                "상품: 제주 무농약 귤 42개", "모두 사시면 싸게 드려요") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.seeweed_resize),
                "상품: 자연산 반건조 미역 10개", "그냥 드려요") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.banana_resize),
                "상품: DOLE 바나나 9개", "약간 많이 익었어요") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pimang_resize),
                "상품: 미니 파프리카 12개", "한개부터 구매 가능!") ;
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.melon_resize),
                "상품: 머스크 멜론 4개", "많이 달아요, 한개 가능!") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.green_resize),
                "상품: 국산 브로콜리 6개", "노란끼 보여요, 싸게 팔아요!") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.strawberry_resize),
                "상품: 논산 딸기 2팩", "2팩 한번에 사실분만!") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.orangejuice_resize),
                "상품: [콜드]오렌지쥬스 1L 4개", "그냥 무료나눔 해요!") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.yangbaechu_resize),
                "상품: 적양배추 1/2통 3개", "1인당 1/2통만 무료나눔 해요!") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.shrimp_resize),
                "상품: 칵테일새우 1팩", "거의 반값에 드려요!") ;



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
