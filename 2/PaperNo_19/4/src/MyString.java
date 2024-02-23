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
    public int f1(String str) 
    {
       int count=0;
       String[] word=str.split("\\s");
       for(String w:word)
       {
           if(Character.toLowerCase(w.charAt(w.length()-1))=='m'||Character.toLowerCase(w.charAt(w.length()-1))=='n')
               count++;
       }
       return count;
    }

    @Override
    public String f2(String str) 
    {
       int count=0;
       String[] word=str.split("\\s");
       int l=0;
       for(String w:word)
       {
           if(l<w.length())
               l=w.length();
       }
       String s="";
       for(String w:word)
       {
            if(w.length()==l&&count==0)
            {
                for(int i=w.length()-1;i>=0;i--)
                {
                   s+=w.charAt(i);
                }
                count++;
                s+=" ";
            }  
            else
                s+=w+" ";
       }
       return s;
    }
    
}
