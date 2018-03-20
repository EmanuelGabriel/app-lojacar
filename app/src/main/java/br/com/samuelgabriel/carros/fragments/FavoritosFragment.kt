package br.com.samuelgabriel.carros.fragments

import br.com.samuelgabriel.carros.activity.CarroActivity
import br.com.samuelgabriel.carros.adapter.CarroAdapter
import br.com.samuelgabriel.carros.domain.Carro
import br.com.samuelgabriel.carros.domain.FavoritosService
import br.com.samuelgabriel.carros.domain.event.FavoritoEvent
import kotlinx.android.synthetic.main.fragment_carros.*
import org.greenrobot.eventbus.Subscribe
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.uiThread

/**
 * Created by EMANUEL on 20/03/2018.
 */

class FavoritosFragment : CarrosFragment() {

    @Suppress("UNUSED_PARAMETER")
    @Subscribe
    fun onRefresh(event: FavoritoEvent) {
        taskCarros()
    }

    override fun taskCarros() {
        doAsync {
            // Busca os carros
            carros = FavoritosService.getCarros()
            uiThread {
                recyclerView.adapter = CarroAdapter(carros) { onClickCarro(it) }

                // Termina a animação do Swipe to Refresh
                swipeToRefresh.isRefreshing = false
            }
        }
    }

    override fun onClickCarro(carro: Carro) {
        // Ao clicar no carro vamos navegar para a tela de detalhes
        activity?.startActivity<CarroActivity>("carro" to carro)
    }


}