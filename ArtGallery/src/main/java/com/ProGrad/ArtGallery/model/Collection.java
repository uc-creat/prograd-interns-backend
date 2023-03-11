package com.ProGrad.ArtGallery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity

public class Collection {

    @Id
    private Long id;
    private int rating;

    private String imageCategoryName;

    private String description;

    @ManyToOne
    private User user;

    public Collection(Long id, int rating, String imageCategoryName, String description, User user) {
        this.id = id;
        this.rating = rating;
        this.imageCategoryName = imageCategoryName;
        this.description = description;
        this.user = user;
    }


    public Collection() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getImageCategoryName() {
        return imageCategoryName;
    }

    public void setImageCategoryName(String imageCategoryName) {
        this.imageCategoryName = imageCategoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "id=" + id +
                ", rating=" + rating +
                ", imageCategoryName='" + imageCategoryName + '\'' +
                '}';
    }
}
