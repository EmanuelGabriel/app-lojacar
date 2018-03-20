package br.com.samuelgabriel.carros.domain.dao

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import br.com.samuelgabriel.carros.domain.Carro

/**
 * Created by EMANUEL on 20/03/2018.
 */

// Define as classes que precisam ser persistidas e a versão do banco
@Database(entities = arrayOf(Carro::class), version = 1)
abstract class CarrosDatabase : RoomDatabase() {
    abstract fun carroDAO(): CarroDAO


}