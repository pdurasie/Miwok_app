package com.example.android.miwok;

import android.app.Activity;

import androidx.core.content.ContextCompat;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorId) {
        super(context, 0, words);
        mColorResourceId = colorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);
        View text_container = listItemView.findViewById(R.id.text_container);
        //View play_btn = listItemView.findViewById(R.id.play_btn);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        text_container.setBackgroundColor(color);
        //play_btn.setBackgroundColor(color);

        ImageView wordImage = listItemView.findViewById(R.id.word_image_view);
        if (currentWord.getImageResourceId() != -1) {
            wordImage.setImageResource(currentWord.getImageResourceId());
        } else {
            wordImage.setVisibility(View.GONE);
        }

        TextView miwokTranslation = listItemView.findViewById(R.id.miwok_text_view);
        miwokTranslation.setText(currentWord.getMiwokWord());
        Log.i("WordAdapter", "Miwok set: " + currentWord.getMiwokWord());
        TextView defaultTranslation = listItemView.findViewById(R.id.default_text_view);
        defaultTranslation.setText(currentWord.getDefaultWord());
        Log.i("WordAdapter", "English set to: " + currentWord.getDefaultWord());

        return listItemView;
    }
}
