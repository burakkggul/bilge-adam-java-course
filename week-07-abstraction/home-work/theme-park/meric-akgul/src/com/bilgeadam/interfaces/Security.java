package com.bilgeadam.interfaces;

import com.bilgeadam.Visitor;

public interface Security {
    boolean isAllowedTo(Visitor visitor);
}
