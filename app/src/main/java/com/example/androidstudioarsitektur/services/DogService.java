package com.example.androidstudioarsitektur.services;

import com.example.androidstudioarsitektur.models.DogRandomResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DogService {
    @GET("breeds/image/random")
    Call<DogRandomResponse> fetchRandomDog();

}
