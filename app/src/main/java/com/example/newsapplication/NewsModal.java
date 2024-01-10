package com.example.newsapplication;

import java.util.ArrayList;

/**
 * The NewsModal class represents a data model for storing news information.
 * It contains details about the total number of results, the status of the news request,
 * and a list of articles retrieved from the news source.
 */
public class NewsModal {
    /**
     * The total number of results available for the news request.
     */
    private int totalResults;

    /**
     * The status of the news request, indicating whether it was successful or not.
     */
    private String status;

    /**
     * The list of articles retrieved from the news source.
     */
    private ArrayList<Articles> articles;


    /**
     * Gets the total number of results available for the news request.
     *
     * @return The total number of results.
     */
    public int getTotalResults() {
        return totalResults;
    }


    /**
     * Sets the total number of results for the news request.
     *
     * @param totalResults The total number of results to be set.
     */
    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }


    /**
     * Gets the status of the news request.
     *
     * @return The status of the news request.
     */
    public String getStatus() {
        return status;
    }


    /**
     * Sets the status of the news request.
     *
     * @param status The status to be set.
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * Gets the list of articles retrieved from the news source.
     *
     * @return The list of articles.
     */
    public ArrayList<Articles> getArticles() {
        return articles;
    }

    /**
     * Sets the list of articles for the news request.
     *
     * @param articles The list of articles to be set.
     */
    public void setArticles(ArrayList<Articles> articles) {
        this.articles = articles;
    }


    /**
     * Constructs a new NewsModal object with the specified parameters.
     *
     * @param totalResults The total number of results available for the news request.
     * @param status       The status of the news request.
     * @param articles     The list of articles retrieved from the news source.
     */
    public NewsModal(int totalResults, String status, ArrayList<Articles> articles) {
        this.totalResults = totalResults;
        this.status = status;
        this.articles = articles;
    }
}
