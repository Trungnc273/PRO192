/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class Cala 
{
    private String owner;
    private int price;

    public Cala() 
    {
    }

    public Cala(String owner, int price) 
    {
        this.owner = owner;
        this.price = price;
    }

    public int getPrice() 
    {
        return price;
    }

    public String getOwner() 
    {
        return owner;
    }

    public void setOwner(String owner) 
    {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.owner + "," + this.price;
    }
    
    
    
}
