package br.com.samuelgabriel.carros.domain.dao

import android.arch.persistence.room.Room
import br.com.samuelgabriel.carros.CarrosApplication

/**
 * Created by EMANUEL on 20/03/2018.
 */

object DatabaseManager {
    // Singleton do Room: banco de dados
    private var dbInstance: CarrosDatabase

    init {
        val appContext = CarrosApplication.getInstance().applicationContext

        // Configura o Room
        dbInstance = Room.databaseBuilder(
                appContext,
                CarrosDatabase::class.java,
                "carros.sqlite")
                .build()
    }

    fun getCarroDAO(): CarroDAO {
        return dbInstance.carroDAO()
    }



}