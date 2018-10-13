/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
import java.util.*;

public class MainBurger {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String item1 = "1    LBB";         //Little Bacon Burger
        String item2 = "1    LTL CAJ";     //Fries Cajun Style
        String itemp1 = "1    LBB                   5.59";
        String itemp2 = "1    LTL CAJ               2.79";
        /* Little Bacon Burger has a bacon on bottom bun 
           and on top bun it has Lettuce and Tomato 
        */ 
        String bacon = "     {{{{ BACON }}}}";
        String fixedtop = "     LETTUCE\n     TOMATO";
        Double item1price = 5.59;          //Price of Little Bacon Burger
        Double item2price = 2.79;          //rate of Fries Cajun Style 
        Double sum = Math.round((item1price + item2price) * 100.0) / 100.0;
        String total = "     Total:               $" + sum;
        /* Using Strategy pattern we have added free toppings on run time like 
           Grilled Onion and Jalapeno grilled
        */
        Context context = new Context(new GOnion());// Adding toppings on run time
        list.add(context.executeStrategy());
        context = new Context(new JGrilled());// Adding toppings on run time
        list.add(context.executeStrategy());
        
        System.out.println("Packing Slip");//Displaying Packing Slip
        System.out.println(item1);
        System.out.println(fixedtop);
        System.out.println("     " + list.get(0));
        System.out.println("     " + list.get(1));
        System.out.println(bacon);
        System.out.println();
        System.out.println(item2);
        System.out.println();
        System.out.println();
        
        System.out.println("Receipt");//Displaying Payment Receipt
        System.out.println(itemp1);
        System.out.println(bacon);
        System.out.println(fixedtop);
        System.out.println("     " + list.get(0));
        System.out.println("     " + list.get(1));
        System.out.println();
        System.out.println(itemp2);
        System.out.println();
        System.out.println(total);
    }
}
