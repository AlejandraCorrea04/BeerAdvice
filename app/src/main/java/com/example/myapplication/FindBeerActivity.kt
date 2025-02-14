package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView
import beeradviser.BeerExpert
import Raza.razadviser



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

    fun onClickFindRaza(view: View?) {
        val pets = findViewById<TextView>(R.id.pets)
        val raza = findViewById<Spinner>(R.id.raza)
        val razas = raza.selectedItem.toString()
        val r: razadviser = razadviser()
        val recomendaciones: ArrayList<String> = r.getRaza(razas)

        var recomendado = ""
        for (i in recomendaciones.indices) {
            recomendado += recomendaciones[i] + "\n"
        }
        pets.text = recomendado
    }
}
