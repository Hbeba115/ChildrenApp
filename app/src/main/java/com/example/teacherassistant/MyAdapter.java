package com.example.teacherassistant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter extends ArrayAdapter<String> {
    String [] names;
    int [] pics;
    Context mContext;

    public MyAdapter(Context context, String [] studentNames, int [] studentPictures){
        super(context,R.layout.activity_list_view);
        this.names = studentNames;
        this.pics = studentPictures;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        if(convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.activity_list_view, parent, false);
            mViewHolder.mPicture = convertView.findViewById(R.id.imageView_listView);
            mViewHolder.mName = convertView.findViewById(R.id.textView_listView);
            convertView.setTag(mViewHolder);
        }
        else{
            mViewHolder = (ViewHolder) convertView.getTag();
        }
            mViewHolder.mPicture.setImageResource(pics[position]);
            mViewHolder.mName.setText(names[position]);

        return convertView;
    }
    static class ViewHolder{
        ImageView mPicture;
        TextView mName;
    }
}
