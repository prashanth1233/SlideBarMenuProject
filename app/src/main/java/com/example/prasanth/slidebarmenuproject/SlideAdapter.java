package com.example.prasanth.slidebarmenuproject;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SlideAdapter extends BaseAdapter {
    private Context context;
    private List<Model> arrayList;

    public SlideAdapter(Context context, List<Model> arrayList)
    {

        this.context=context;
        this.arrayList=arrayList;
    }


    public View getView(int position, View convertView, ViewGroup viewGroup)
    {
        View view;

        if(convertView==null)
        {
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.listview_layout,viewGroup,false);
        }
        else
            view=convertView;
        ImageView imageView=(ImageView)view.findViewById(R.id.imageIcon);
        TextView title=(TextView)view.findViewById(R.id.title);
        TextView subTitle=(TextView)view.findViewById(R.id.subTitle);
        imageView.setImageResource(arrayList.get(position).getIcon());
        title.setText(arrayList.get(position).getTitle());
        subTitle.setText(arrayList.get(position).getSubTitle());
        return view;
    }

    public int getCount()
    {
     return arrayList.size();
    }

    public Object getItem(int position)
    {
        return arrayList.get(position);
    }
    public long getItemId(int position)
    {
        return 0;
    }


}
