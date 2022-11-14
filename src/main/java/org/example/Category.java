package org.example;

import java.util.Arrays;

public class Category {
    private String title;
    private Product[] products;

    public Category(String title, Product[] products) {
        this.title = title;
        this.products = products;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "title='" + title + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
