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
    private String code;
    private double price;

    public Brick() 
    {
        this.code=null;
        this.price=0;
    }

    public Brick(String code, double price) 
    {
        this.code = code;
        this.price = price;
    }

    public String getCode() 
    {
        return code;
    }

    public void setCode(String code) 
    {
        this.code = code;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }
    
}
