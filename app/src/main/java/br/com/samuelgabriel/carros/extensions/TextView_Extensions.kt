package br.com.samuelgabriel.carros.extensions

import android.widget.TextView

/**
 * Created by EMANUEL on 20/03/2018.
 */


var TextView.string: String
    get() = text.toString()

    // método getters & setters
    set(value) {
        text = value
    }



fun TextView.isEmpty() = text.trim().isEmpty()

