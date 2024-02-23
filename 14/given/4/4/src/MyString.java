/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRUNG
 */
public class MyString implements IString
{

    @Override
    public int sum(String string) 
    {
        String[] word=string.split(" ");
        String pattern = "\\d*";
        int a=0, b=0,c=0;
        for(String w:word)
        {
            if(w.matches(pattern))
            {
                int k=0;
                for(int i=0;i<w.length();i++)
                {
                    
                    k+=Character.getNumericValue(w.charAt(i));
                }
                if(c==0)
                {
                    a=k;
                    c=1;
                }  
                else
                    b=k;
                    
            }    
        }    
        return a+b;
    }

    @Override
    public String getCode(String string) 
    {
        String[] word=string.split(" ");
        String pattern = "\\d*";
        String a="",b="";
        int c=0;
        for(String w:word)
        {
            if(w.matches(pattern))
            {
                String k="";
                for(int i=w.length()-1;i>=0;i--)
                {
                    
                    k+=w.charAt(i);
                }
                if(c==0)
                {
                    a=k;
                    c=1;
                }  
                else
                    b=k;
                    
            }    
        } 
        return a+" "+b;
    }
    
}
