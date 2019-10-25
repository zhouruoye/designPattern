package com.cest.structural.decorator;

public class BatterCake extends ABatterCake {

    @Override
    public String getDes() {
        return "买一个煎饼";
    }

    @Override
    public int cost() {
        return 5;
    }
}
