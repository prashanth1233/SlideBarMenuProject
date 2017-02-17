package com.example.prasanth.slidebarmenuproject;

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        List<Model> arrayList=new ArrayList<Model>();
        ListView list;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList.add(new Model(R.drawable.home,"HOME","DETAILS ARE INSIDE"));
        arrayList.add(new Model(R.drawable.profile,"PROFILE","DETAILS ARE INSIDE"));
        arrayList.add(new Model(R.drawable.settings,"SETTINGS","DETAILS ARE INSIDE"));
        SlideAdapter slideAdapter=new SlideAdapter(MainActivity.this,arrayList);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(slideAdapter);
    }
}
