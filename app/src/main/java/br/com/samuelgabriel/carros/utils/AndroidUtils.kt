package br.com.samuelgabriel.carros.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

/**
 * Created by EMANUEL on 20/03/2018.
 */
object AndroidUtils {


    fun isNetworkAvailable(context: Context): Boolean{

        val connectivity = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networks = connectivity.allNetworks

        return networks
                .map { connectivity.getNetworkInfo(it)}
                .any { it.state == NetworkInfo.State.CONNECTED};

    }


}