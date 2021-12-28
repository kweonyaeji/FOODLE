package org.techtown.foodle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.ListFragment;

public class BasketListFragment extends ListFragment {

    ListViewAdapter adapter ;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        adapter = new ListViewAdapter() ;
        setListAdapter(adapter) ;

        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.kiwii_resize),
                "상품: 무농약 골드키위 6개", "모두 사실 분만") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.hotdog_resize),
                " [고메]\n 올바른 핫도그 5개입 10개 묶음", " 인원: 7명/25명 | 가격: 4,200원/개") ;
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.yogurt_resize),
                " [서울우유]\n 요거트 65ml 20개입 20개 묶음", " 인원: 47명/50명 | 가격: 2,240원/개") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.yangbaechu_resize),
                "상품: 적양배추 1/2통 3개", "1인당 1/2통만 무료나눔 해요!") ;

        return super.onCreateView(inflater, container, savedInstanceState);



    }
}