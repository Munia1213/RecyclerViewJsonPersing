package com.example.munia.recyclerviewjsonpersing;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by munia on 5/2/2019.
 */

public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}
