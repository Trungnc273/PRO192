/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class MyClass implements IProcess
{

    @Override
    public int countWords(String str1, String str2) 
    {
        int count=0;
        String[] word =str1.split(" ");
        for(String w:word)
        {
            if(w.equalsIgnoreCase(str2))
                count++;
        }
        return count;
    }

    @Override
    public String getLastWord(String str) 
    {
       String s="";
       String[] word=str.split(" ");
       for(String w:word)
       {
           s=w;
       }
       s=s.toUpperCase().charAt(0)+s.substring(1);
       return s;
    }
    
}
