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
        String[] word=str.split(" ");
        for(String w:word)
        {
            if(Character.isDigit(w.charAt(0))&&!Character.isDigit(w.charAt(w.length()-1)))
            {
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) 
    {
        String s="";
        String[] word=str.split(" ");
        int count=0;
        for(String w:word)
        {
            int k=0;
            for(int i=0;i<w.length();i++)
            {
                if(Character.isDigit(w.charAt(i)))
                    k++;
            }
            if(k==1)
                count++;
            if(count==2)
            {
                count++;
                continue;
            }
            s+=w+" ";
                
        }
        return s;
    }
    
}
