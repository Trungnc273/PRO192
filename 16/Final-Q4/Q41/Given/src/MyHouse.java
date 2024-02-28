/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRUNG
 */
public class MyHouse implements House
{
    private int price;
    private String address;

    public MyHouse(int price, String address) 
    {
        this.price = price;
        this.address = address;
    }

    @Override
    public double getPricetoUSD() 
    {
        return price*1.0/23000;
    }

    @Override
    public String getCode() 
    {
        String s="";
        int k=1;
        for(int i=0;i<address.length();i++)
        {
            if(Character.isLetter(address.charAt(i)))
                k=0;
        }
        if(k==1)
            s=address.substring(0,3);
        else
            s=address.substring(address.length()-3);
        return s;
    }
    
}
