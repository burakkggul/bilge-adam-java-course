package com.bilgeadam.homework;

import com.bilgeadam.homework.theme.park.TestAbstactClass;
import com.bilgeadam.homework.theme.park.ThemePark;

public class Main {
    public static void main(String[] args) {
        TestAbstactClass test = new TestAbstactClass();
        test.getInToDodgems();
        test.getintoRollercoaster();

        ThemePark themePark = new ThemePark();
        themePark.getAllReviewed();
        themePark.visit(test.getVisitor(), test.getDodgems());
    }
}
