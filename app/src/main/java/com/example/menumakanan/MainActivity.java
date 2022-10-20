package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recKuliner;
    private ArrayList<Kuliner> listKuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recKuliner = findViewById(R.id.rec_kuliner);
        initData();

        recKuliner.setAdapter(new KulinerAdapter(listKuliner));
        recKuliner.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listKuliner = new ArrayList<>();

        // Koneksi DB
        // Query
        // Iterasi hasil query ke arraylist
        listKuliner.add(new Kuliner("Pecel Lele",
                "15.000",
                "Lele goreng dipecel coi",
                R.drawable.pecel_lele));

        listKuliner.add(new Kuliner("Nasi Goreng Mercon",
                "14.500",
                "Nasi goreng pake bumbu serbuk mercon",
                R.drawable.nasgor_mercon));

        listKuliner.add(new Kuliner("Ayam Geprek Keju",
                "20.000",
                "Ayam yang digeprek dilumuri keju",
                R.drawable.ayam_geprek_keju));

        listKuliner.add(new Kuliner("Kari Ayam",
                "17.500",
                "Kari ayam pake bumbu indomie",
                R.drawable.kari));

        listKuliner.add(new Kuliner("Tahu Bulat",
                "500",
                "Tahu kok bulat",
                R.drawable.tahu_bulat));

        listKuliner.add(new Kuliner("Salad buah",
                "12.000",
                "Salad sayur sama buah",
                R.drawable.salad_buah));
    }
}