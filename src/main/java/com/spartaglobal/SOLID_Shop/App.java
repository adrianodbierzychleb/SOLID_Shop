package com.spartaglobal.SOLID_Shop;

import com.spartaglobal.SOLID_Shop.OpenClosedPrinciple.DiscountManager;
import com.spartaglobal.SOLID_Shop.OpenClosedPrinciple.FantasyFIlmDiscount;
import com.spartaglobal.SOLID_Shop.Students.Apprentice;
import com.spartaglobal.SOLID_Shop.Students.ManageStudents;
import com.spartaglobal.SOLID_Shop.Students.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//        FantasyFIlmDiscount fantasyFIlmDiscount = new FantasyFIlmDiscount();
//        fantasyFIlmDiscount.setDiscount("20%");
//        DiscountManager discountManager = new DiscountManager();
//        discountManager.processDiscount(fantasyFIlmDiscount);


        Apprentice adrian = new Apprentice("Adrian","Odbierzychleb", "Java SDET");
        Student adrianTwo = new Student("AdrianTWO", "OdbierzychlebTWO", "Java SDET");
        ManageStudents manageStudents = new ManageStudents();
        manageStudents.gatAllStudentsDetails(adrian);

    }
}
