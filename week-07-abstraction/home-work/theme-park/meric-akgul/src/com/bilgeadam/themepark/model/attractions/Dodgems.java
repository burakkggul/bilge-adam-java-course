package com.bilgeadam.themepark.model.attractions;
import com.bilgeadam.themepark.interfaces.Ticketed;
import com.bilgeadam.themepark.model.people.Visitor;
import com.bilgeadam.themepark.model.attractions.base.Attraction;

public class Dodgems extends Attraction implements Ticketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 8.0;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return visitor.getAge() < 12 ? this.defaultPrice() / 2 : this.defaultPrice();
    }
}
