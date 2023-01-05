package com.example.usmgo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.usmgo.databinding.ActivityAdminBinding;

public class admin extends AppCompatActivity {

    ActivityAdminBinding binding;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        binding = ActivityAdminBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        binding.navBarAdmin.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.admin_approval:
                    replaceFragment(new driver_approval());
                    break;
                case R.id.admin_search:
                    replaceFragment(new user_search());
                    break;
                case R.id.admin_report:
                    replaceFragment(new user_report());
                    break;
            }
            return true;
        });

    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_admin,fragment);
        fragmentTransaction.commit();
    }
}
