/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRUNG
 */
public class Motor 
{
    private String brandName;
    private double price;

    public Motor() 
    {
    }

    public Motor(String brandName, double price) 
    {
        this.brandName = brandName;
        this.price = price;
    }

    public String getBrandName() 
    {
        return brandName;
    }

    public double getPrice() 
    {
        return price;
    }

    @Override
    public String toString() 
    {
        return brandName+"\t"+price;
    }
    
}
