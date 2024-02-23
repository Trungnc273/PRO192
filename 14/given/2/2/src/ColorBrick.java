/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRUNG
 */
public class ColorBrick extends Brick
{
    private String maker;

    public ColorBrick() 
    {
        this.maker=null;
    }
    
    public ColorBrick( String code, String maker, double price) 
    {
        super(code, price);
        this.maker = maker;
    }
    
    @Override
    public double getPrice()
    {
        double increment=0;
        if(maker.substring(0, 1).equalsIgnoreCase("j"))
            increment=0.1;
        return super.getPrice()+super.getPrice()*increment;
    }

    @Override
    public String toString() 
    {
        return super.getCode()+" "+maker+" "+super.getPrice();
    }
    
}
