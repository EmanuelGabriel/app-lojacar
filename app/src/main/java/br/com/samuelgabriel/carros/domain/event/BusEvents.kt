package br.com.samuelgabriel.carros.domain.event

import br.com.samuelgabriel.carros.domain.Carro

/**
 * Created by EMANUEL on 20/03/2018.
 */

data class SaveCarroEvent(val carro: Carro)

data class FavoritoEvent(val carro: Carro)
