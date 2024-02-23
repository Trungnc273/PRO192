/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class MyProcess implements IProcess
{

    @Override
    public String getReverseString(String string) 
    {
        String s="";
        for(int i=string.length()-1;i>=0;i--)
        {
            s+=string.charAt(i);
        }
        return s;
    }

    @Override
    public int countDigitsInString(String string) 
    {
        int num=0;
        for(int i=0;i<string.length();i++)
        {
            if(Character.isDigit(string.charAt(i)))
                num++;
        }
        return num;
    }
    
}
