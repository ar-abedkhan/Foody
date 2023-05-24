package com.abedkhan.foody;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.abedkhan.foody.Fragment.CartFragment;
import com.abedkhan.foody.Fragment.HomeFragment;
import com.abedkhan.foody.Fragment.ProfileFragment;
import com.abedkhan.foody.databinding.ActivityMainBinding;

import io.ak1.OnBubbleClickListener;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());





        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new HomeFragment()).commit();


        binding.bubblevar.addBubbleListener(new OnBubbleClickListener() {
            @Override
            public void onBubbleClick(int i) {



                switch (i) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new HomeFragment()).commit();
                        Log.i("tag", "clicked: " + 0);
                        break;

                    case R.id.cart:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new CartFragment()).commit();
                        Log.i("tag", "clicked: " + 1);
                        break;

                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new ProfileFragment()).commit();
                        Log.i("tag", "clicked: " + 2);

                        break;
                }

            }
        });










    }
}