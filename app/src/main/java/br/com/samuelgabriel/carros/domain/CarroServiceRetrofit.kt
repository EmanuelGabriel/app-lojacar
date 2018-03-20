package br.com.samuelgabriel.carros.domain

import java.io.File
import android.util.Base64
import br.com.samuelgabriel.carros.domain.retrofit.CarrosREST
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by EMANUEL on 20/03/2018.
 */

/**
 * Implementação com Retrofit
 */
object CarroServiceRetrofit {
    private val BASE_URL = "http://livrowebservices.com.br/rest/carros/"
    private var service: CarrosREST

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        service = retrofit.create(CarrosREST::class.java)
    }

    // Busca os carros por tipo (clássicos, esportivos ou luxo)
    fun getCarros(tipo: TipoCarro): List<Carro>? {
        val call = service.getCarros(tipo.name)
        val carros = call.execute().body()
        return carros
    }

    // Salva um carro
    fun save(carro: Carro): Response? {
        val call = service.save(carro)
        val response = call.execute().body()
        return response
    }

    // Deleta um carro
    fun delete(carro: Carro): Response? {
        val call = service.delete(carro.id)
        val response = call.execute().body()
        return response
    }

    // Upload de Foto
    fun postFoto(file: File): Response? {

        // Converte para Base64
        val bytes = file.readBytes()
        val base64 = Base64.encodeToString(bytes, Base64.NO_WRAP)

        val call = service.postFoto(file.name, base64)
        val response = call.execute().body()
        return response
    }


}