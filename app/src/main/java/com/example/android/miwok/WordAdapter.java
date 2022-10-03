package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word>{

    private int mColorResourceId;

    public WordAdapter(@NonNull Context context, ArrayList<Word> list, int colorResourceId) {
        super(context, 0,list);
        mColorResourceId = colorResourceId;

    }

    public View getView(int position , View convertView , ViewGroup parent){
    // Use the recyled view if any
        View listItemView = convertView;
        // if there is no recycled view
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }
        Word currentWord = getItem(position);

        TextView miwokTextView = listItemView.findViewById(R.id.miwok);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView defaultTextView = listItemView.findViewById(R.id.english);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        ImageView imageView = listItemView.findViewById(R.id.image);

        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        View container = listItemView.findViewById(R.id.container);

        int color = ContextCompat.getColor(getContext(),mColorResourceId);

        container.setBackgroundColor(color);


        return  listItemView;
    }



}
