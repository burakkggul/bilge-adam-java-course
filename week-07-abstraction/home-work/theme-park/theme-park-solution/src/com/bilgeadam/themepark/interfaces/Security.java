package com.bilgeadam.themepark.interfaces;

import com.bilgeadam.themepark.model.people.Visitor;

public interface Security {
    boolean isAllowedTo(Visitor visitor);
}
