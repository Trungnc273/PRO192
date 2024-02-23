/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class ColorBox extends Box
{
    private int color;

    public ColorBox() {
    }

    public ColorBox(String code, double price, int color) 
    {
        super(code, price);
        this.color = color;
    }
    
    public double getNewPrice()
    {
        double inc,price1;
        if(color>100)
            inc=10*super.getPrice()/100;
        else
            inc=0;
        price1=super.getPrice()+inc;
        return price1;
    }

    @Override
    public String toString() 
    {
        return super.toString()+"    "+color;
    }
    
}
