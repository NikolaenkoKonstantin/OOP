package org.example;

public class User {
    private String login;
    private String password;
    private Basket basket;

    //конструктор для пользователя которому сразу всучили корзину товаров(возможно такое бывает)
    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    //конструктор для пользователя который только зашел и не имеет сразу продуктов в корзине
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public void buyProduct(Product product){
        if(basket == null)
            basket = new Basket();

        basket.addProductInBasket(product);
    }
}
