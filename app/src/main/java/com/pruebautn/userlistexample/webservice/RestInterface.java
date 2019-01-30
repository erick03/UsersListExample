package com.pruebautn.userlistexample.webservice;

import com.pruebautn.userlistexample.entities.User;

import java.util.List;
import retrofit2.Call;

import retrofit2.http.GET;

public interface RestInterface {

    @GET("users")
    Call<List<User>> getUsersGithub();
}