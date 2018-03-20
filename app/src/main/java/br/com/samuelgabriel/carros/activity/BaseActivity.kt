package br.com.samuelgabriel.carros.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.samuelgabriel.carros.R

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}
