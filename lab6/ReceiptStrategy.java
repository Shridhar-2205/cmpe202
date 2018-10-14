/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class ReceiptStrategy implements Strategy{

   
    @Override
    public String Sort(String B, String L, String T, String T1, String U) {
        String str=B+"\n"+L+"\n"+T+"\n"+T1+U;
        return str; //To change body of generated methods, choose Tools | Templates.
    }
    
}
