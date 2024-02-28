package com.example.appschool1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class recyclerView extends AppCompatActivity {

    List<Item> foods = new ArrayList<>();

    int[] foodImage ={R.drawable.bakwandung,R.drawable.bassreng,R.drawable.bangsobakar,R.drawable.sopbuntut,
            R.drawable.ayamguling,R.drawable.sapikrauk,R.drawable.ayam_cimahi,R.drawable.tirenx,R.drawable.francefroizy,
            R.drawable.telorsafiii,R.drawable.blackswan,R.drawable.telorbacem,R.drawable.ikanrebus,R.drawable.sapibumbumerah,
            R.drawable.bulusan,R.drawable.laufy};
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewParent);

        foodsMenu();

        recylerViewAdapter adapter = new recylerViewAdapter(this,foods);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

private void foodsMenu(){
        String[] foodsNameRv = getResources().getStringArray(R.array.foodNameRv);
        String[] foodsPriceRv = getResources().getStringArray(R.array.foodPriceRv);
         for(int i = 0; i < foodsNameRv.length;i++){
             foods.add(new Item(foodsNameRv[i],foodsPriceRv[i],foodImage[i]));
         }

}


}