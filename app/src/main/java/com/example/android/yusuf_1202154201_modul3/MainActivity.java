package com.example.android.yusuf_1202154201_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private final LinkedList<String> mTitleList = new LinkedList<>();
    private final LinkedList<String> mSubTitleList = new LinkedList<>();
    private final LinkedList<Integer> mBackgroundList = new LinkedList<>();
    private int mCount = 0;
    private RecyclerView mRecyclerView;
    private ListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new ListAdapter(this, mTitleList, mSubTitleList, mBackgroundList);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));
    }

    private void setData(){
        String brands[] = {"Ades","Amidis", "Aqua", "Cleo", "Club", "Equil", "Evian", "Leminerale", "Nestle", "Pristine", "Vit"};
        for (String brand: brands) {
            mTitleList.addLast(brand);
            mSubTitleList.addLast("Ini adalah air minum merk "+brand);
        }
        mBackgroundList.addLast(R.drawable.ades);
        mBackgroundList.addLast(R.drawable.amidis);
        mBackgroundList.addLast(R.drawable.aqua);
        mBackgroundList.addLast(R.drawable.cleo);
        mBackgroundList.addLast(R.drawable.club);
        mBackgroundList.addLast(R.drawable.equil);
        mBackgroundList.addLast(R.drawable.evian);
        mBackgroundList.addLast(R.drawable.leminerale);
        mBackgroundList.addLast(R.drawable.nestle);
        mBackgroundList.addLast(R.drawable.pristine);
        mBackgroundList.addLast(R.drawable.vit);
    }
}
