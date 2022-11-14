package org.example;

/*
Добавил добавление товара в корзину пользователя, по заданию не нужно было, но так поинтереснее стало
 */

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Product1", 100, 6);
        Product product2 = new Product("Product2", 200, 11);
        Product product3 = new Product("Product3", 300, -1);
        Product product4 = new Product("Product4", 400, 2);

        Category category1 = new Category("Categoty1", new Product[]{product1, product2});
        Category category2 = new Category("Categoty2", new Product[]{product3, product4});

        System.out.println();
        //Первая категория товаров
        System.out.println(category1);
        //Вторая категория товаров
        System.out.println(category2);

        User user1 = new User("User1", "123");

        System.out.println();
        //User1 купил product1
        user1.buyProduct(product1);
        System.out.println(user1.getBasket());

        //User1 купил product2
        user1.buyProduct(product2);
        System.out.println(user1.getBasket());

        //User1 купил product3
        user1.buyProduct(product3);
        System.out.println(user1.getBasket());




    }
}