/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class SpecCar extends Car
{
    private int warranty;

    public SpecCar() {
    }

    public SpecCar(int warranty) 
    {
        this.warranty = warranty;
    }

    public SpecCar(String name, double price, int warranty) 
    {
        super(name, price);
        this.warranty = warranty;
    }

    @Override
    public String toString() 
    {
        return String.format("%s,%.2f,%d", super.getName().toUpperCase(),super.getPrice(),warranty);
    }

    public int getWarranty() 
    {
        if(super.getName().equalsIgnoreCase("Audi"))
            return warranty+5;
        else
            return warranty+2;
    }
    
}
