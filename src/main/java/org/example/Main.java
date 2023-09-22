package org.example;
import org.example.model.*;
import org.example.model.constants.*;
import org.example.service.ShoppingCart;
public class Main {
    public static void main(String[] args){

        Meat meet = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);
        Food[] groceryBasket = { meet, redApple, greenApple };

        ShoppingCart shoppingCart = new ShoppingCart(groceryBasket);

        shoppingCart.logicShoppingCart();

        System.out.println("Общая сумма продуктов в корзине без учёта скидки: " + shoppingCart.getAmountWithoutDiscount());
        System.out.println("Общая сумма продуктов в корзине с учётом скидки: " + shoppingCart.getAmountDiscount());
        System.out.println("Cумму всех вегетарианских продуктов в корзине без учёта скидки: " + shoppingCart.getAmountVegWithoutDiscount());
    }
}