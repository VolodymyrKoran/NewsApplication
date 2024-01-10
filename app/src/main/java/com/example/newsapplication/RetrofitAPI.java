package com.example.newsapplication;

import retrofit2.http.GET;
import retrofit2.http.Url;
import retrofit2.Call;

/**
 * RetrofitAPI interface defines the contract for making HTTP requests to a news API
 * using the Retrofit library.
 */
public interface RetrofitAPI {

    /**
     * Makes a GET request to retrieve all news based on the provided URL.
     *
     * @param url The URL for fetching all news.
     * @return A Call object representing the asynchronous request for news data.
     */
    @GET
    Call<NewsModal> getAllNews(@Url String url);


    /**
     * Makes a GET request to retrieve news based on the specified category and URL.
     *
     * @param url The URL for fetching news by category.
     * @return A Call object representing the asynchronous request for news data.
     */
    @GET
    Call<NewsModal> getNewsByCategory(@Url String url);

}
