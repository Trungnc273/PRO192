
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class Product 
{
    private int id,quantity,discount;
    private String name;
    private double price;
    public Product() 
    {
    }

    public Product(int id, String name, double price, int quantity, int discount) 
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public void setDiscount(int discount) 
    {
        if(discount<0)
            this.discount=0;
        else
            this.discount = discount;
    }

    @Override
    public String toString() 
    {
        double subTotal=quantity*price*(100-discount)/100;
        return String.format("%d,%s,%.2f,%d,%.2f",id,name,price,quantity,subTotal);
    }
    
}
