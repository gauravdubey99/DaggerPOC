package com.daggerpoc.daggerpoc.data.remote

import com.android.volley.VolleyError

interface RequestInterface {

    fun onResponse(response : String)

    fun onVolleyError(volleyError : VolleyError)
}