package com.animations.maroof.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.animations.maroof.R;
import com.animations.maroof.activities.AnimatedParticlesActivity;
import com.animations.maroof.activities.ConfettiActivity;
import com.animations.maroof.activities.EmitterBackgroundActivity;
import com.animations.maroof.activities.EmitterIntermediateActivity;
import com.animations.maroof.activities.EmitterSimpleActivity;
import com.animations.maroof.activities.EmitterTimeLimitedActivity;
import com.animations.maroof.activities.EmitterWithGravityActivity;
import com.animations.maroof.activities.FireworksActivity;
import com.animations.maroof.activities.FollowCursorActivity;
import com.animations.maroof.activities.OneShotAdvancedActivity;
import com.animations.maroof.activities.OneShotSimpleActivity;
import com.animations.maroof.bean.ListItems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maroof Ahmed Siddique on 2/4/2017.
 */
public class ListItemsAdapter extends BaseAdapter {

    private List<ListItems> mList = new ArrayList<>();
    private Activity mActivity;

    public ListItemsAdapter(Activity mActivity, List<ListItems> mList) {
        this.mActivity = mActivity;
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final ViewHolder holder;
        if (convertView == null) {

            /***********  Layout inflator to call external xml layout () ***********/
            LayoutInflater inflater = (LayoutInflater) mActivity.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            /****** Inflate tabitem.xml file for each row ( Defined below ) *******/
            convertView = inflater.inflate(R.layout.listview_row_item, null);

            holder = new ViewHolder();

            holder.mClick = (TextView) convertView.findViewById(R.id.click);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        final ListItems listItems = mList.get(position);
        holder.mClick.setText(listItems.getName());

        holder.mClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (listItems.getPosition().equalsIgnoreCase("1")) {
                    Intent one = new Intent(mActivity, OneShotSimpleActivity.class);
                    mActivity.startActivity(one);
                } else if (listItems.getPosition().equalsIgnoreCase("2")) {
                    Intent one = new Intent(mActivity, OneShotAdvancedActivity.class);
                    mActivity.startActivity(one);
                } else if (listItems.getPosition().equalsIgnoreCase("3")) {
                    Intent one = new Intent(mActivity, EmitterSimpleActivity.class);
                    mActivity.startActivity(one);
                } else if (listItems.getPosition().equalsIgnoreCase("4")) {
                    Intent one = new Intent(mActivity, EmitterBackgroundActivity.class);
                    mActivity.startActivity(one);
                } else if (listItems.getPosition().equalsIgnoreCase("5")) {
                    Intent one = new Intent(mActivity, EmitterIntermediateActivity.class);
                    mActivity.startActivity(one);
                } else if (listItems.getPosition().equalsIgnoreCase("6")) {
                    Intent one = new Intent(mActivity, EmitterTimeLimitedActivity.class);
                    mActivity.startActivity(one);
                } else if (listItems.getPosition().equalsIgnoreCase("7")) {
                    Intent one = new Intent(mActivity, EmitterWithGravityActivity.class);
                    mActivity.startActivity(one);
                } else if (listItems.getPosition().equalsIgnoreCase("8")) {
                    Intent one = new Intent(mActivity, FollowCursorActivity.class);
                    mActivity.startActivity(one);
                } else if (listItems.getPosition().equalsIgnoreCase("9")) {
                    Intent one = new Intent(mActivity, AnimatedParticlesActivity.class);
                    mActivity.startActivity(one);
                }else if (listItems.getPosition().equalsIgnoreCase("10")) {
                    Intent one = new Intent(mActivity, FireworksActivity.class);
                    mActivity.startActivity(one);
                }else if (listItems.getPosition().equalsIgnoreCase("11")) {
                    Intent one = new Intent(mActivity, ConfettiActivity.class);
                    mActivity.startActivity(one);
                }
            }
        });

        return convertView;
    }

    class ViewHolder {
        TextView mClick;
    }
}
