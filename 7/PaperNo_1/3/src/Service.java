/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class Service 
{
    private String name;
    private int price;

    public Service(String name, int price) 
    {
        this.name = name;
        this.price = price;
    }

    public String getName() 
    {
        return name;
    }

    public int getPrice() 
    {
        return price;
    }

    public void setPrice(int price) 
    {
        if(price>0)
            this.price = price;
    }
    
    
    
}
