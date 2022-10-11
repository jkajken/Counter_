package com.example.counter_;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainFragment extends Fragment {
    private TextView counter;
    private Button plusButton;
    private Button minusButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        counter = view.findViewById(R.id.tv_zero);
        plusButton = view.findViewById(R.id.plusButton);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = counter.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                counter.setText(String.valueOf(value));


            }
        });
        minusButton = view.findViewById(R.id.minusButton);
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = counter.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                counter.setText(String.valueOf(value));

            }
        });
    }
}