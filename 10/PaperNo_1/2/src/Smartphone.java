/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class Smartphone extends Product
{
    private int price, internal_memory;
    private float weight;

    public Smartphone(String code, String name, int internal_memory, float weight, int price) {
        super(code, name);
        this.price = price;
        this.internal_memory = internal_memory;
        this.weight = weight;
    }
    
    public void showInfor()
    {
        System.out.println(code+"-"+name+"-"+internal_memory+"GB"+"-"+weight+"g"+"-"+price+"$");
    }
    
    public double buyNow(int quantity)
    {
        int tt=quantity*price;
        if(name.equals("IPHONE 14 PROMAX")&&quantity>=5)
            return tt-(tt*20)/100;
        else
            return tt;
    }
}
