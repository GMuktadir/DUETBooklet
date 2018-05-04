package com.techfar.service.duetbooklet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Asus on 12-Apr-18.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] menuicon;
    String[] menu;
    private LayoutInflater inflater;
    CustomAdapter(Context context,String[] menu,int[] menuicon){
        this.context=context;
        this.menu=menu;
        this.menuicon=menuicon;
    }
    @Override
    public int getCount() {
        return menu.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null)
        {
            inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.sample_grid,viewGroup,false);
        }
        ImageView imageView=(ImageView) view.findViewById(R.id.img_sample);
        TextView textView=(TextView) view.findViewById(R.id.gridtitle);

        imageView.setImageResource(menuicon[i]);
        textView.setText(menu[i]);
        return view;
    }
}
