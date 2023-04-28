package com.mirea.klinevskayadm.lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.mirea.klinevskayadm.lesson4.databinding.ActivityMainBinding;

public	class	MainActivity	extends	AppCompatActivity	{
    private ActivityMainBinding binding;
    @Override
    protected	void	onCreate(Bundle	savedInstanceState)	{
        super.onCreate(savedInstanceState);
        binding	=	ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        binding.editText.setText("Мой	номер	по	списку	№14");
        binding.button.setOnClickListener(new	View.OnClickListener()	{
            @Override
            public	void	onClick(View	v)	{
                Log.d(MainActivity.class.getSimpleName(),"onClickListener");
            }
        });
    }


}