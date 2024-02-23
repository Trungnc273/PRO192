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
            String s="";
            for(int i=w.length()-1;i>=0&&w.length()>1;i--)
            {
                s+=w.charAt(i);
            }
            if(w.equals(s))
                count++;
        }
        return count;
    }

    @Override
    public String f2(String str) 
    {
        int ml=0;
        int count=0;
        String s="";
        String[] word=str.split(" ");
        for(String w:word)
        {
            if(w.length()>ml)
                ml=w.length();
        }
        for(String w: word)
        {
            if(count==1)
                break;
            if(w.length()==ml)
            {
                count=1;
                s=w;
            }   
        }
        return s;
    }
    
}
