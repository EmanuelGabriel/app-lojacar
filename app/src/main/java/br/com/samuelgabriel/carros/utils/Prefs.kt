package br.com.samuelgabriel.carros.utils

import android.content.SharedPreferences
import br.com.samuelgabriel.carros.CarrosApplication

/**
 * Created by EMANUEL on 20/03/2018.
 */

object Prefs {

    val PREF_ID = "carros"
    private fun prefs(): SharedPreferences {

        val context = CarrosApplication.getInstance().applicationContext
        return context.getSharedPreferences(PREF_ID, 0)
    }

    fun setInt(flag: String, valor: Int) = prefs().edit().putInt(flag, valor).apply()
    fun getInt(flag: String) = prefs().getInt(flag, 0)
    fun setString(flag: String, valor: String) = prefs().edit().putString(flag, valor).apply()
    fun getString(flag: String) = prefs().getString(flag, "")

    var tabIdx: Int
        get() = getInt("tabIdx")
        set(value) = setInt("tabIdx",value)


}