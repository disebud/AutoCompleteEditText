package com.disebud.autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] namaTemen = {
            "Wahyu RizQi",
            "Nur Zain Pradana",
            "Didik Setya Budi",
            "Kunto Aji",
            "Afif Maheir",
            "Al-Fahry",
            "Marbun ",
            "Ravie",
            "Lailatul Zahro",
            "Dinny Sulistiowati",
            "Fahri Saputra",
            "Dika",
            "Rico",
            "Fajar",
            "Ariq",
            "Dede Khair"
    };

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, namaTemen);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.txtCountries);
        textView.setThreshold(3);
        textView.setAdapter(adapter);
    }
}