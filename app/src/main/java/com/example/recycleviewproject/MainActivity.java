package com.example.recycleviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);

        List<String> names = new ArrayList<>();
        names.add("Christopher");
        names.add("Amelia");
        names.add("Isabella");
        names.add("Andrew");
        names.add("David");
        names.add("Olivia");
        names.add("Emma");
        names.add("Charlotte");
        names.add("James");
        names.add("William");
        names.add("Mia");

        rv.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter(this, names);
        rv.setAdapter(adapter);
    }
}
