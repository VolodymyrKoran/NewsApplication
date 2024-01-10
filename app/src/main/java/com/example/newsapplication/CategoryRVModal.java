package com.example.newsapplication;

/**
 * Represents a category for use in a RecyclerView.
 * Each instance of this class holds information about a category,
 * including the category name and its associated image URL.
 */
public class CategoryRVModal {

    /** The name of the category. */
    private String category;

    /** The URL of the image associated with the category. */
    private String categoryImageUrl;

    /**
     * Gets the name of the category.
     *
     * @return The name of the category.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the name of the category.
     *
     * @param category The new name of the category.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Gets the URL of the image associated with the category.
     *
     * @return The URL of the image.
     */
    public String getCategoryImageUrl() {
        return categoryImageUrl;
    }

    /**
     * Sets the URL of the image associated with the category.
     *
     * @param categoryImageUrl The new URL of the image.
     */
    public void setCategoryImageUrl(String categoryImageUrl) {
        this.categoryImageUrl = categoryImageUrl;
    }

    /**
     * Constructs a new CategoryRVModal with the specified category name and image URL.
     *
     * @param category The name of the category.
     * @param categoryImageUrl The URL of the image associated with the category.
     */
    public CategoryRVModal(String category, String categoryImageUrl) {
        this.category = category;
        this.categoryImageUrl = categoryImageUrl;
    }
}
