package com.example.medamoniaravind.loginform;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter {
    Context ctx;
    String[] c;
    Integer[] d;
    TextView tv;
    ImageView iv;

    public CustomAdapter(LocationActivity locationActivity, String[] c, Integer[] d) {
        super(locationActivity,R.layout.costumfile,c);
        this.ctx=locationActivity;
        this.c=c;
        this.d=d;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater li=(LayoutInflater.from(ctx));
        convertView=li.inflate(R.layout.costumfile,null,false);
        tv=convertView.findViewById(R.id.tv);
        tv.setText(c[position]);
        iv=convertView.findViewById(R.id.iv);
        iv.setImageResource(d[position]);
        return convertView;

    }
}
