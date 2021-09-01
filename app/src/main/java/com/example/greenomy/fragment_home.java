package com.example.greenomy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment_home extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        CheckedTextView chkBox1 = view.findViewById(R.id.first_chBox);
        ImageView trash1 = view.findViewById(R.id.first_trash);
        chkBox1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (((CheckedTextView) view).isChecked()) {
                    ((CheckedTextView) view).setChecked(false);
                    trash1.setVisibility(View.VISIBLE);
                } else {
                    ((CheckedTextView) view).setChecked(true);
                    trash1.setVisibility(View.INVISIBLE);
                }
            }
        });

        CheckedTextView chkBox2 = view.findViewById(R.id.second_chBox);
        ImageView trash2 = view.findViewById(R.id.second_trash);
        chkBox2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (((CheckedTextView) view).isChecked()) {
                    ((CheckedTextView) view).setChecked(false);
                    trash2.setVisibility(View.VISIBLE);
                } else {
                    ((CheckedTextView) view).setChecked(true);
                    trash2.setVisibility(View.INVISIBLE);
                }
            }
        });

        CheckedTextView chkBox3 = view.findViewById(R.id.third_chBox);
        ImageView trash3 = view.findViewById(R.id.third_trash);
        chkBox3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (((CheckedTextView) view).isChecked()) {
                    ((CheckedTextView) view).setChecked(false);
                    trash3.setVisibility(View.VISIBLE);
                } else {
                    ((CheckedTextView) view).setChecked(true);
                    trash3.setVisibility(View.INVISIBLE);
                }
            }
        });
        return view;
    }
}
