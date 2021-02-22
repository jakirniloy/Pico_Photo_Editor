package com.example.pico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.pico.databinding.ActivityMainBinding;
import com.example.pico.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {
    ActivityResultBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        if(getIntent().getData()!=null){
            binding.imageView4.setImageURI(getIntent().getData());

        }else {

            Toast.makeText(getApplicationContext(),"error404", Toast.LENGTH_SHORT).show();
        }


    }
}