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
        String item1 = "1    LBB";         
        String item2 = "\n1    LTL CAJ";     
        String itemp1 = "1    LBB                   5.59";
       
        String bacon = "     {{{{ BACON }}}}";
        String fixedtop = "     LETTUCE\n     TOMATO";
        String vartop   = "     ->G ONION\n     ->JALA Grilled";
        Double item1price = 5.59;          
        Double item2price = 2.79;           
        Double sum = Math.round((item1price + item2price) * 100.0) / 100.0;
        String total = "     Total:               $" + sum;
        String itemp2 = "\n1    LTL CAJ               2.79\n                           "+sum;
        Context context = new Context(new ReceiptStrategy());
        list.add(context.executeStrategy(itemp1,bacon,fixedtop,vartop,itemp2));
        context = new Context(new PackingSlipStrategy());
        list.add(context.executeStrategy(item1,fixedtop,vartop,bacon,item2));
        System.out.println("Receipt:");
        System.out.println(list.get(0));
        
        System.out.println("Packing Slip");
        System.out.println(list.get(1));
        
        
    }
}
