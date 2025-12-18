package com.example.singers;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView singers;
    private ArrayList<String> singerslist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        singers = findViewById(R.id.singers);

        loadSingers();

        singers.setLayoutManager(new LinearLayoutManager(this));
        SingersAdapter adapter = new SingersAdapter(singerslist);
        singers.setAdapter(adapter);
    }

    private void loadSingers() {
        singerslist.add("Michael Jackson");
        singerslist.add("Freddie Mercury");
        singerslist.add("Elvis Presley");
        singerslist.add("Whitney Houston");
        singerslist.add("Adele");
        singerslist.add("Taylor Swift");
        singerslist.add("Bruno Mars");
        singerslist.add("Beyoncé");
        singerslist.add("Ed Sheeran");
        singerslist.add("Rihanna");
        singerslist.add("Lady Gaga");
        singerslist.add("Justin Bieber");
        singerslist.add("Ariana Grande");
        singerslist.add("Drake");
        singerslist.add("The Weeknd");
        singerslist.add("Billie Eilish");
        singerslist.add("Dua Lipa");
        singerslist.add("Harry Styles");
        singerslist.add("Post Malone");
        singerslist.add("SZA");
        singerslist.add("Olivia Rodrigo");
        singerslist.add("Sam Smith");
        singerslist.add("Shawn Mendes");
        singerslist.add("Katy Perry");
        singerslist.add("Sia");
        singerslist.add("Shakira");
        singerslist.add("Miley Cyrus");
        singerslist.add("Lana Del Rey");
        singerslist.add("Frank Sinatra");
        singerslist.add("Aretha Franklin");
    }
}