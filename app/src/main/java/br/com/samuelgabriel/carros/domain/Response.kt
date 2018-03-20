package br.com.samuelgabriel.carros.domain

/**
 * Created by EMANUEL on 20/03/2018.
 */


data class Response (val id:Long,val status:String,val msg:String,val url:String) {
    fun isOk() = "OK".equals(status, ignoreCase = true)

}