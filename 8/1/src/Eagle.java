/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class Eagle 
{
    private String type;
    private int quantity;

    public Eagle() 
    {
    }

    public Eagle(String type, int quantity) 
    {
        this.type = type;
        this.quantity = quantity;
    }

    public String getType() 
    {
        String s=type.substring(0,1)+type.charAt(2);
        return s;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }
    
}
