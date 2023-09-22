package org.example.service;
import org.example.model.Food;

public class ShoppingCart {
    private final Food[] GROCERY_BASKET;

    public ShoppingCart(Food[] groceryBasket){
        this.GROCERY_BASKET = groceryBasket;
    }


    private double amountWithoutDiscount;       // получить общую сумму товаров в корзине без скидки,
    private double amountDiscount;              // получить общую сумму товаров в корзине со скидкой,
    private double amountVegWithoutDiscount;    // получить общую сумму всех вегетарианских продуктов в корзине без скидки.



    public void logicShoppingCart() {
        for (Food food : GROCERY_BASKET) {

        amountWithoutDiscount += food.getPrice() * food.getAmount();
        }
        amountDiscount = amountWithoutDiscount;
        amountVegWithoutDiscount = amountWithoutDiscount;

        for (Food food : GROCERY_BASKET) { //вычитаем из корзины сумму скидки
            if (food.getDiscount() != 0) {
                amountDiscount -= food.getPrice() * food.getAmount() * food.getDiscount() / 100;
            }
            if (!food.getIsVegetarian()) { //вычитаем из корзины не веганское
                amountVegWithoutDiscount -= food.getPrice() * food.getAmount();
            }
        }

    }
    public double getAmountWithoutDiscount(){
        return amountWithoutDiscount;
    }
    public double getAmountDiscount(){
        return amountDiscount;
    }
    public double getAmountVegWithoutDiscount(){
        return amountVegWithoutDiscount;
    }
}
        /* Был второй вариант в один цикл
          for (int i = 0; i < food.length; i++) {
            amountWithoutDiscount +=  food[i].getPrice() * food[i].getAmount();
            amountDiscount +=  food[i].getPrice() * food[i].getAmount();
            amountVegWithoutDiscount +=  food[i].getPrice() * food[i].getAmount();
                if (food[i].getDiscount() != 0) {
                amountDiscount -=  food[i].getPrice() * food[i].getAmount() * food[i].getDiscount() / 100;
            }
                if (!food[i].getIsVegetarian()){
                amountVegWithoutDiscount -= food[i].getPrice() * food[i].getAmount();
            }} */