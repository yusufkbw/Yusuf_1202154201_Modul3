package com.example.android.yusuf_1202154201_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Detail extends AppCompatActivity {

    TextView title, liter;
    ImageView photo,baterry;
    private int liters = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        String Title = intent.getStringExtra("Title");
        Integer Background = intent.getIntExtra("Background",0);

        title = (TextView)findViewById(R.id.detailTitle);
        liter = (TextView)findViewById(R.id.Liter);
        photo = (ImageView)findViewById(R.id.detailPhoto);
        baterry = (ImageView)findViewById(R.id.baterry);

        title.setText(Title);
        Bottle();
        photo.setImageResource(Background);
    }

    public void onPlus(View view) {
        liters++;
        Bottle();
    }

    public void onMin(View view) {
        liters--;
        Bottle();
    }
    public void Bottle(){
        if (liters <= 0 ){
            // 20%
            liter.setText("1L");
            baterry.setImageResource(R.drawable.ic_battery_20);
            Toast.makeText(this,"Air sedikit",Toast.LENGTH_SHORT).show();
        }else if (liters == 1){
            // 50%
            liter.setText("2L");
            baterry.setImageResource(R.drawable.ic_battery_50);
        }else if(liters == 2){
            // 80%
            liter.setText("3L");
            baterry.setImageResource(R.drawable.ic_battery_80);
        }else{
            // 100%
            liter.setText("4L");
            baterry.setImageResource(R.drawable.ic_battery_full);
            Toast.makeText(this,"Air penuh",Toast.LENGTH_SHORT).show();
        }
    }
}
