package com.mytsyk.sommelier.sommelier.ui.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.mytsyk.sommelier.sommelier.R;

import java.util.ArrayList;


public class HomeActivity extends AppCompatActivity {

    private RecyclerView rvNotifications;
    private NotificationsAdapter mNotificationAdapter;
    private ArrayList<Boolean> emptyData;
    private ListView lvLeftMenu;
    private final static int[] mMassIcon = {R.drawable.ic_menu_dashboard,
            R.drawable.ic_menu_bottle,
            R.drawable.ic_menu_navigation,
            R.drawable.ic_menu_notification,
            R.drawable.ic_menu_statistic,
            R.drawable.ic_menu_news};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        setData();
        setListeners();
    }

    private void initView() {
        rvNotifications = (RecyclerView) findViewById(R.id.activity_home_rv_notifications);
        lvLeftMenu = (ListView) findViewById(R.id.activity_home_list_view_menu);

        final RecyclerView rvIncome = (RecyclerView) findViewById(R.id.home_rv_income);
        final IncomeOutgoAdapter incomeOutgoAdapter = new IncomeOutgoAdapter();

        rvIncome.setLayoutManager(new LinearLayoutManager(this));
        rvIncome.setAdapter(incomeOutgoAdapter);
    }


    private void setData() {
        emptyData = new ArrayList<>();
        emptyData.add(true);
        emptyData.add(true);
        emptyData.add(true);
        emptyData.add(false);
        emptyData.add(true);
        emptyData.add(true);
        emptyData.add(false);
        emptyData.add(false);
        emptyData.add(true);
        emptyData.add(true);

        mNotificationAdapter = new NotificationsAdapter(getApplicationContext(), emptyData);
        rvNotifications.setLayoutManager(new LinearLayoutManager(this));
        rvNotifications.setAdapter(mNotificationAdapter);


        final String[] massIconName = getResources().getStringArray(R.array.left_menu_names);
        MenuAdapter menuAdapter = new MenuAdapter(this, mMassIcon, massIconName);
        lvLeftMenu.setAdapter(menuAdapter);
    }


    private void setListeners(){
        lvLeftMenu.setOnItemClickListener(menuListener);
    }

    private AdapterView.OnItemClickListener menuListener= new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        }
    };

}
