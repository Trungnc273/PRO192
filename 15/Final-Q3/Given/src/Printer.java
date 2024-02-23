/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRUNG
 */
public class Printer 
{
    private double price;
    private String name;

    public Printer() 
    {
    }

    public Printer(String name, double price) 
    {
        this.price = price;
        this.name = name;
    }

    public double getPrice() 
    {
        return price;
    }

    public String getName() 
    {
        return name;
    }
    
}
