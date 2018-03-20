package br.com.samuelgabriel.carros.extensions

/**
 * Created by EMANUEL on 20/03/2018.
 */


// Utilizar onClick ao invés de setOnClickListener
fun android.view.View.onClick(l: (v: android.view.View?) -> Unit) {
    setOnClickListener(l)

}