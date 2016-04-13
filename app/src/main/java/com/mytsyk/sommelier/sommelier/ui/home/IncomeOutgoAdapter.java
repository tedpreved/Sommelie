package com.mytsyk.sommelier.sommelier.ui.home;


import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mytsyk.sommelier.sommelier.R;

public class IncomeOutgoAdapter extends RecyclerView.Adapter<IncomeOutgoAdapter.DataHolder> {


    @Override
    public DataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_card_income, parent, false);
        return new DataHolder(view);
    }

    @Override
    public void onBindViewHolder(DataHolder holder, int position) {
        holder.dividerTopPart.setVisibility(position == 0 ? View.GONE : View.VISIBLE);
        holder.dividerBottomPart.setVisibility(position == getItemCount() - 1 ? View.GONE : View.VISIBLE);

        holder.cvOutgo.setVisibility(position == 1 || position == 4 ? View.GONE : View.VISIBLE);
        holder.cvIncome.setVisibility(position == 2 ? View.GONE : View.VISIBLE);

        holder.rlOutgoContainerBox.setVisibility(position == 2 || position == 0 ? View.GONE : View.VISIBLE);
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public static class DataHolder extends RecyclerView.ViewHolder {
        private CardView cvIncome;
        private TextView tvIncomeDate;
        private TextView tvIncomeDesctription;
        private RelativeLayout rlIncomeContainerBox;
        private TextView tvIncomeBoxCount;
        private RelativeLayout rlIncomeContainerBottle;
        private TextView tvIncomeBottleCount;

        private CardView cvOutgo;
        private TextView tvOutgoDate;
        private TextView tvOutgoDesctription;
        private RelativeLayout rlOutgoContainerBox;
        private TextView tvOutgoBoxCount;
        private RelativeLayout rlOutgoContainerBottle;
        private TextView tvOutgoBottleCount;

        private View dividerTopPart;
        private View dividerBottomPart;

        public DataHolder(View itemView) {
            super(itemView);
            cvIncome = (CardView) itemView.findViewById(R.id.item_card_income_card_income);
            tvIncomeDate = (TextView) itemView.findViewById(R.id.item_card_income_tv_date);
            tvIncomeDesctription = (TextView) itemView.findViewById(R.id.item_card_income_tv_description);
            rlIncomeContainerBox = (RelativeLayout) itemView.findViewById(R.id.item_card_income_container_box);
            tvIncomeBoxCount = (TextView) itemView.findViewById(R.id.item_card_income_tv_box_count);
            rlIncomeContainerBottle = (RelativeLayout) itemView.findViewById(R.id.item_card_income_container_bottle);
            tvIncomeBottleCount = (TextView) itemView.findViewById(R.id.item_card_income_tv_bottle_count);

            cvOutgo = (CardView) itemView.findViewById(R.id.item_card_income_card_outgo);
            tvOutgoDate = (TextView) itemView.findViewById(R.id.item_card_outgo_tv_date);
            tvOutgoDesctription = (TextView) itemView.findViewById(R.id.item_card_outgo_tv_description);
            rlOutgoContainerBox = (RelativeLayout) itemView.findViewById(R.id.item_card_outgo_container_box);
            tvOutgoBoxCount = (TextView) itemView.findViewById(R.id.item_card_outgo_tv_box_count);
            rlOutgoContainerBottle = (RelativeLayout) itemView.findViewById(R.id.item_card_outgo_container_bottle);
            tvOutgoBottleCount = (TextView) itemView.findViewById(R.id.item_card_outgo_tv_bottle_count);

            dividerTopPart = itemView.findViewById(R.id.item_card_income_divider_part_top);
            dividerBottomPart = itemView.findViewById(R.id.item_card_income_divider_bottom_part);
        }
    }
}
