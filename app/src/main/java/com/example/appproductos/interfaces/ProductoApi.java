package com.example.appproductos.interfaces;

import com.example.appproductos.models.Producto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ProductoApi {

    @GET("api/productos/{id}")
    public Call<Producto> find(@Path("id") String id);

}
