/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRUNG
 */
public class Computer 
{
    private String name,color;
    private double price;

    public Computer() 
    {
    }

    public Computer(String name, String color, double price) 
    {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() 
    {
        return name;
    }

    public double getPrice() 
    {
        return price;
    }

    @Override
    public String toString() 
    {
        return name+"\t"+price+"\t"+color;
    }

    public String getColor() 
    {
        return color;
    }
    
    
}
