package com.mytsyk.sommelier.sommelier.ui.home;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mytsyk.sommelier.sommelier.R;

import java.util.ArrayList;


public class NotificationsAdapter extends RecyclerView.Adapter<NotificationsAdapter.HolderNotification> {

    private ArrayList<Boolean> mArrayNotifications;
    private Context mContext;

    public NotificationsAdapter(Context context,ArrayList<Boolean> massNotification) {
        mArrayNotifications = massNotification;
        mContext=context;
    }

    @Override
    public HolderNotification onCreateViewHolder(ViewGroup parent, int viewType) {
         View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_notification_card, parent, false);
        return new HolderNotification(view);
    }

    @Override
    public void onBindViewHolder(HolderNotification holder, int position) {
        if(!mArrayNotifications.get(position)){
            holder.rlBackground.setBackground(ContextCompat.getDrawable(mContext,R.drawable.background_notification_card_green));
            holder.ivIconNotification.setImageDrawable(ContextCompat.getDrawable(mContext,R.drawable.ic_box));
        } else {
            holder.rlBackground.setBackground(ContextCompat.getDrawable(mContext,R.drawable.background_notification_card_red));
            holder.ivIconNotification.setImageDrawable(ContextCompat.getDrawable(mContext,R.drawable.ic_bottle_dark));
        }
    }

    @Override
    public int getItemCount() {
        return mArrayNotifications == null ? 0 : mArrayNotifications.size();
    }

    public static class HolderNotification extends RecyclerView.ViewHolder {
        private CardView cardView;
        private RelativeLayout rlBackground;
        private TextView tvDateAndTime;
        private TextView tvProductCount;
        private TextView tvProductName;
        private TextView tvDescription;
        private ImageView ivIconNotification;

        public HolderNotification(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.item_notification_card);
            rlBackground=(RelativeLayout)itemView.findViewById(R.id.item_notification_rl_background);
            tvDateAndTime = (TextView) itemView.findViewById(R.id.item_notification_tv_date_and_time);
            tvProductCount = (TextView) itemView.findViewById(R.id.item_notification_tv_product_count);
            tvProductName = (TextView) itemView.findViewById(R.id.item_notification_tv_product_name);
            tvDescription = (TextView) itemView.findViewById(R.id.item_notification_tv_product_description);
            ivIconNotification = (ImageView) itemView.findViewById(R.id.item_notification_iv_icon_type);
        }
    }


}

