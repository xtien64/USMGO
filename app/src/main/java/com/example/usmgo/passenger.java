package com.example.usmgo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.usmgo.databinding.PassengerBinding;

public class passenger extends AppCompatActivity {

    PassengerBinding binding;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.passenger);
        binding = PassengerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.Home:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.History:
                    replaceFragment(new HistoryFragment());
                    break;
                case R.id.Profile:
                    replaceFragment(new ProfileFragment());
                    break;
            }

            return true;
        });

    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_passenger,fragment);
        fragmentTransaction.commit();
    }

}
