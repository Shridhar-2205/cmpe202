/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class PackingSlipStrategy implements Strategy{

    
    @Override
    public String Sort(String L, String T, String T1, String B, String U) {
        String str=L+"\n"+T+"\n"+T1+"\n"+B+U;
        return str;  //To change body of generated methods, choose Tools | Templates.
    }
    
}
