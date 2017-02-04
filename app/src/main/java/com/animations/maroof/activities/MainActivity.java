package com.animations.maroof.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.animations.maroof.R;
import com.animations.maroof.adapter.ListItemsAdapter;
import com.animations.maroof.bean.ListItems;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private List<ListItems> mList = new ArrayList<>();
    private ListItemsAdapter mListItemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.list);

        if (mList.size() > 0) {
            mList.clear();
        }

        ListItems bean = new ListItems();
        bean.setName("One Shot Simple");
        bean.setPosition("1");
        mList.add(bean);

        ListItems bean1 = new ListItems();
        bean1.setName("One Shot Advanced");
        bean1.setPosition("2");
        mList.add(bean1);

        ListItems bean2 = new ListItems();
        bean2.setName("Emitter Simple");
        bean2.setPosition("3");
        mList.add(bean2);

        ListItems bean3 = new ListItems();
        bean3.setName("Emitter Advanced");
        bean3.setPosition("4");
        mList.add(bean3);

        ListItems bean4 = new ListItems();
        bean4.setName("Emitter Intermediate");
        bean4.setPosition("5");
        mList.add(bean4);

        ListItems bean5 = new ListItems();
        bean5.setName("Emitter Time Limited");
        bean5.setPosition("6");
        mList.add(bean5);

        ListItems bean6 = new ListItems();
        bean6.setName("Emitter With Gravity");
        bean6.setPosition("7");
        mList.add(bean6);

        ListItems bean7 = new ListItems();
        bean7.setName("Follow Cursor");
        bean7.setPosition("8");
        mList.add(bean7);

        ListItems bean8 = new ListItems();
        bean8.setName("Animated Particles");
        bean8.setPosition("9");
        mList.add(bean8);

        ListItems bean9 = new ListItems();
        bean9.setName("Fireworks");
        bean9.setPosition("10");
        mList.add(bean9);

        ListItems bean10 = new ListItems();
        bean10.setName("Confetti");
        bean10.setPosition("11");
        mList.add(bean10);

        if (mList != null && mList.size() > 0) {
            mListItemsAdapter = new ListItemsAdapter(this, mList);
            mListView.setAdapter(mListItemsAdapter);
        }

    }

}
