package org.example.model;
import org.example.model.constants.*;

public class Apple extends Food {

    private String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        isVegetarian = true;
        if (colour.equals(Colour.RED)) {
            this.colour = colour;
        } else if ((colour.equals(Colour.GREEN))) {
            this.colour = colour;
        }
    }
    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED)) {
            return Discount.getRedAppleDiscount();
        }
            return 0;
    }
}