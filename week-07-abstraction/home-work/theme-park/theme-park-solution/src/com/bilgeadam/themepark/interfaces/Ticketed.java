package com.bilgeadam.themepark.interfaces;

import com.bilgeadam.themepark.model.people.Visitor;

public interface Ticketed {
    double defaultPrice();
    double priceFor(Visitor visitor);
    double getPrice(Visitor visitor);
}
