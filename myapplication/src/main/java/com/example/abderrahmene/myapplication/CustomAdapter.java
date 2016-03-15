package com.example.abderrahmene.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Abderrahmene on 25/02/2016.
 */
public class CustomAdapter extends BaseAdapter {

    Context context;
    List<Book> bookList;

    public CustomAdapter(Context context, List<Book> bookList) {
        this.context = context;
        this.bookList = bookList;
    }

    @Override
    public int getCount() {
        return bookList.size();
    }

    @Override
    public Object getItem(int position) {
        return bookList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = parent.inflate(context,R.layout.list_item,null);
        TextView textView = (TextView) convertView.findViewById(R.id.textView2);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        textView.setText(bookList.get(position).getTitle());
        imageView.setImageResource(bookList.get(position).getCover());





        return convertView;
    }
}