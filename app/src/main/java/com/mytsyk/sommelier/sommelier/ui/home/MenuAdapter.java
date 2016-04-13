package com.mytsyk.sommelier.sommelier.ui.home;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mytsyk.sommelier.sommelier.R;


public class MenuAdapter extends BaseAdapter {
    private Context mContext;

    private int[] mIcons;
    private String[] mIconNames;

    public MenuAdapter(Context mContext, int[] mIcons, String[] mIconNames) {
        this.mContext = mContext;
        this.mIcons = mIcons;
        this.mIconNames = mIconNames;
    }

    @Override
    public int getCount() {
        return mIcons == null ? 0 : mIcons.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        final HolderMenu holder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.item_menu_listview, parent, false);
            holder = new HolderMenu();
            holder.mIcon = (ImageView) view.findViewById(R.id.item_menu_im_icon);
            holder.mName = (TextView) view.findViewById(R.id.item_menu_tv_name);
            view.setTag(holder);
        } else {
            holder = (HolderMenu) view.getTag();
        }
        holder.mIcon.setImageDrawable(ContextCompat.getDrawable(mContext, mIcons[position]));
        holder.mName.setText(mIconNames[position]);
        return view;
    }

    private class HolderMenu {
        private ImageView mIcon;
        private TextView mName;
    }
}
