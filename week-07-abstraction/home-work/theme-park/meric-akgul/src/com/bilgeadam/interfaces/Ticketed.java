package com.bilgeadam.interfaces;

import com.bilgeadam.Visitor;

public interface Ticketed {
    double defaultPrice();
    double priceFor(Visitor visitor);
}
