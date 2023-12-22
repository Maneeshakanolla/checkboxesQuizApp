package com.example.quizeappselectmultipleoptions.services;

import com.example.quizeappselectmultipleoptions.model.QuestionList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuestionApi {
    @GET("myquizeapiexample2.php")
    Call<QuestionList> getQuestion();
}
