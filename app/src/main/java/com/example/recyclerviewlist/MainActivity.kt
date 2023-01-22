package com.example.recyclerviewlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val countrySet = listOf(
            "Argentina",
            "Australia",
            "Bangladesh",
            "Canada",
            "China",
            "Finland",
            "france",
            "Great Britain",
            "sri lanka",
            "India",
            "japan",
            "Norway",
            "Pakistan",
            "United States"
        )
        val countryFlagSet = listOf<Int>(
            R.drawable.argentina,
            R.drawable.australia,
            R.drawable.bangladesh,
            R.drawable.canada,
            R.drawable.china,
            R.drawable.finland,
            R.drawable.france,
            R.drawable.great_britain,
            R.drawable.srilanka,
            R.drawable.india,
            R.drawable.japan,
            R.drawable.norway,
            R.drawable.pakistan,
            R.drawable.united_states
        )


        recyclerView.adapter = CountryArrayAdapter(countrySet, countryFlagSet)
    }
}