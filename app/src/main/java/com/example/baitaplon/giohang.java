package com.example.baitaplon;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.baitaplon.drawerLayout.Cart;
import com.example.baitaplon.drawerLayout.CartManager;


import java.util.ArrayList;
import java.util.List;

public class giohang extends AppCompatActivity {
    private ArrayList<product> cartList;
    private RecyclerView recyclerView;
    private Cart cart ;
    private ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giohang); // Ensure giohang.xml layout has a RecyclerView with ID recyclerView

        // Initialize the back button and set its click listener
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); // Closes the activity and goes back
            }
        });
       recyclerView=findViewById(R.id.recyclerView);
       cart=Cart.getInstance();
    }

}