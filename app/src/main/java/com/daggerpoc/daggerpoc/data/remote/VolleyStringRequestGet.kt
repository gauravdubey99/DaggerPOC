package com.daggerpoc.daggerpoc.data.remote

import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import dagger.Module
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by gaurav on 20/3/18.
 */
@Singleton
@Module(includes = arrayOf(VolleyRequestProvider::class))
class VolleyStringRequestGet @Inject constructor(){

    @Inject lateinit var reqQueue: RequestQueue

    fun provideStringRequest(requestUrl : String, reqListener : RequestInterface){
        val strRequest = StringRequest(Request.Method.GET, requestUrl,
                Response.Listener<String> { response ->
                    reqListener.onResponse(response)
                },
                Response.ErrorListener {
                    reqListener.onVolleyError(it)
                })
        reqQueue.add(strRequest)
    }
}