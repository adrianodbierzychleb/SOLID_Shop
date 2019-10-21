package com.spartaglobal.SOLID_Shop.OpenClosedPrinciple;

public class DiscountManager {
    // no dependncy on a single object, but on an interface
    //any object implementing the interface can be placed in the method.
    public void processDiscount(IFilmDiscount iFilmDiscount){
        System.out.println(iFilmDiscount.filmDiscount());
    }



}
