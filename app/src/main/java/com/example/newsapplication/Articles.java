package com.example.newsapplication;

/**
 * The {@code Articles} class represents news articles with various properties such as title, description,
 * image URL, article URL, and content.
 */
public class Articles {

    /**
     * The title of the news article.
     */
    private String title;

    /**
     * A brief description or summary of the news article.
     */
    private String description;

    /**
     * The URL to the image associated with the news article.
     */
    private String urlToImage;

    /**
     * The URL to the full news article.
     */
    private String url;

    /**
     * The content or main body of the news article.
     */
    private String content;

    /**
     * Returns the title of the news article.
     *
     * @return The title of the news article.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the news article.
     *
     * @param title The title of the news article.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns a brief description or summary of the news article.
     *
     * @return A brief description or summary of the news article.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets a brief description or summary of the news article.
     *
     * @param description A brief description or summary of the news article.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the URL to the image associated with the news article.
     *
     * @return The URL to the image associated with the news article.
     */
    public String getUrlToImage() {
        return urlToImage;
    }

    /**
     * Sets the URL to the image associated with the news article.
     *
     * @param urlToImage The URL to the image associated with the news article.
     */
    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    /**
     * Returns the URL to the full news article.
     *
     * @return The URL to the full news article.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the URL to the full news article.
     *
     * @param url The URL to the full news article.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Returns the content or main body of the news article.
     *
     * @return The content or main body of the news article.
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the content or main body of the news article.
     *
     * @param content The content or main body of the news article.
     */
    public void setContent(String content) {
        this.content = content;
    }


    /**
     * Constructs a new {@code Articles} instance with the specified properties.
     *
     * @param title        The title of the news article.
     * @param description  A brief description or summary of the news article.
     * @param urlToImage   The URL to the image associated with the news article.
     * @param url          The URL to the full news article.
     * @param content      The content or main body of the news article.
     */
    public Articles(String title, String description, String urlToImage, String url, String content) {
        this.title = title;
        this.description = description;
        this.urlToImage = urlToImage;
        this.url = url;
        this.content = content;
    }
}
