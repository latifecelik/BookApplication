package com.latife.bookapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputBinding;
import android.widget.TextView;

import com.latife.bookapplication.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Singleton singleton=Singleton.getInstance();
        Bookapp selectedBook= singleton.getSentBook();

        binding.textView.setText(selectedBook.name);
        binding.textView2.setText(selectedBook.review);
        binding.imageView.setImageResource(selectedBook.image);

    }

}