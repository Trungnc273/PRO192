/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRUNG
 */
public class MyConvertible implements Convertible
{

    @Override
    public double toMile(double d) 
    {
        return d*0.621371;
    }

    @Override
    public String getCode(String string) 
    {
        String s="";
        for(int i=0;i<string.length();i++)
        {
            s+=string.charAt(i);
            if((i+1)%3==0&&(i+1)!=string.length())
                s+="-";
        }
        return s;
    }
    
}
