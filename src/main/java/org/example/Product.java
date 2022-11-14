package org.example;

public class Product {
    private String title;
    private int price;
    private int rating;

    public Product(String title, int price, int rating) {
        this.title = title;
        this.price = price;
        setRating(rating);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if(rating < 0) this.rating = 0;
        else if(rating > 10) this.rating = 10;
        else this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
