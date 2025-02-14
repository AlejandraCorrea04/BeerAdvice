package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView
import beeradviser.BeerExpert


class FindBeerActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_beer)
    }

    fun onClickFindBeer(view: View?) {
        val brands = findViewById<TextView>(R.id.brands)
        val color = findViewById<Spinner>(R.id.color)
        val beerType = color.selectedItem.toString()
        val e: BeerExpert = BeerExpert()
        val recomendaciones: ArrayList<String> = e.getBrands(beerType)

        var recomendado = ""
        for (i in recomendaciones.indices) {
            recomendado += recomendaciones[i] + "\n"
        }
        brands.text = recomendado
    }
}
