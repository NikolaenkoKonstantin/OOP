package org.example;

import java.util.Arrays;

public class Basket {
    private Product[] buyProducts;

    public Product[] getBuyProducts() {
        return buyProducts;
    }

    public void setBuyProducts(Product[] buyProducts) {
        this.buyProducts = buyProducts;
    }

    public void addProductInBasket(Product product){
        int length = 0;

        if(buyProducts != null)
            length = buyProducts.length;

        Product[] products = new Product[length + 1];
        products[length] = product;

        for(int i = 0; i < length; i++){
            products[i] = buyProducts[i];
        }

        buyProducts = products;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "buyProducts=" + Arrays.toString(buyProducts) +
                '}';
    }
}
