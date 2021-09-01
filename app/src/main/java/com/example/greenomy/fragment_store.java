package com.example.greenomy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment_store extends Fragment {
    boolean click = true;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_store, container, false);

        ImageButton nonClicked_pine_tree = view.findViewById(R.id.nonClicked_pine_tree);
        ImageView pine_tree = view.findViewById(R.id.pine_tree);
        ImageView discount_point = view.findViewById(R.id.discount_point);
        nonClicked_pine_tree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (click) {
                    pine_tree.setVisibility(View.INVISIBLE);
                    discount_point.setVisibility(View.VISIBLE);
                    nonClicked_pine_tree.setImageResource(R.mipmap.clicked_pine_tree);
                    click = false;
                } else {
                    pine_tree.setVisibility(View.VISIBLE);
                    discount_point.setVisibility(View.INVISIBLE);
                    nonClicked_pine_tree.setImageResource(R.mipmap.nonclicked_pine_tree);
                    click = true;
                }
            }
        });
        return view;
    }
}
