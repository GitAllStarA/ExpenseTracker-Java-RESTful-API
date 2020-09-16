package com.hello.expensetrackerapi.domain;

public class Category extends Object{
        private Integer categoryId;
        private Integer userId;
        private String title;
        private String description;
        private Double totalExpenses;


        public Category(Integer categoryId, Integer userId, String title, String description, Double totalExpenses) {
        this.categoryId = categoryId;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.totalExpenses = totalExpenses;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTotalExpenses(Double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Double getTotalExpenses() {
        return totalExpenses;
    }
}
