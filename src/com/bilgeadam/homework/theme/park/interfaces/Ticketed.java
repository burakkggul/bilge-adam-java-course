package com.bilgeadam.homework.theme.park.interfaces;

import com.bilgeadam.homework.theme.park.Visitor;

public interface Ticketed {
    public double defaultPrice();
    public double priceFor(Visitor Visitor);
}
