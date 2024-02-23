/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRUNG
 */
public class Brick 
{
    private double price;
    private String code;

    public Brick() 
    {
        this.price=0;
        this.code=null;
    }

    public Brick(String code, double price) 
    {
        this.price = price;
        this.code = code;
    }

    public double getPrice() 
    {
        return price;
    }

    public String getCode() 
    {
        return code;
    }

    @Override
    public String toString() 
    {
        return code+" "+price;
    }
    
}
