/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class MyString implements IString
{

    @Override
    public int f1(String string) 
    {
        int sum=0;
        for(int i=0;i<string.length();i++)
        {
            if(Character.isDigit(string.charAt(i))&&(string.charAt(i)-'0')%2==0)
                sum+=(string.charAt(i)-'0');
        }
        return sum;
    }

    @Override
    public String f2(String string) 
    {
        String s="";
        for(int i=0;i<string.length();i++)
        {
            if(Character.isDigit(string.charAt(i))&&(string.charAt(i)-'0')%2==0)
                continue;
            else
                s+=string.charAt(i);
        }
        return s;
    }
    
}
