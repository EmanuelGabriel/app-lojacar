package br.com.samuelgabriel.carros.activity

import android.os.Bundle
import br.com.samuelgabriel.carros.R
import br.com.samuelgabriel.carros.domain.TipoCarro
import br.com.samuelgabriel.carros.extensions.addFragment
import br.com.samuelgabriel.carros.extensions.setupToolbar
import br.com.samuelgabriel.carros.fragments.CarrosFragment

/**
 * Created by EMANUEL on 20/03/2018.
 */

class CarrosActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carros)

        // Argumentos: tipo do carro
        val tipo = intent.getSerializableExtra("tipo") as TipoCarro
        val title = getString(tipo.string)
        // Toolbar: configura o título e o "up navigation"
        setupToolbar(R.id.toolbar, title, true)
        if (savedInstanceState == null) {
            // Adiciona o fragment no layout de marcação
            // Dentre os argumentos que foram passados para a activity, está o tipo do carro.
            addFragment(R.id.container, CarrosFragment())
        }
    }
}