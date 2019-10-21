package com.spartaglobal.SOLID_Shop;

import com.spartaglobal.SOLID_Shop.OpenClosedPrinciple.DiscountManager;
import com.spartaglobal.SOLID_Shop.OpenClosedPrinciple.FantasyFIlmDiscount;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        FantasyFIlmDiscount fantasyFIlmDiscount = new FantasyFIlmDiscount();
        fantasyFIlmDiscount.setDiscount("20%");
        DiscountManager discountManager = new DiscountManager();
        discountManager.processDiscount(fantasyFIlmDiscount);
    }
}
