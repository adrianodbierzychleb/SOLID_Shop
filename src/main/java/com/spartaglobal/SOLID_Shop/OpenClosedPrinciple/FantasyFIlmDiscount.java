package com.spartaglobal.SOLID_Shop.OpenClosedPrinciple;

public class FantasyFIlmDiscount implements IFilmDiscount{
    private String discount;


    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Override
    public String filmDiscount() {
        return this.discount;
    }
}
