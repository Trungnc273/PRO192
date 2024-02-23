/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class StringProcessor implements IMyString
{

    @Override
    public String removeSpaces(String string) 
    {
        String[] word=string.split(" ");
        String s="";
        for(String w:word)
        {
            if(w.length()>0)
                s+=w+" ";
        }
        return s.trim();
    }

    @Override
    public int countWordByString(String string, String string1)
    {
        int count=0;
        String[] word=string.split(" ");
        for(String w:word)
        {
            if((w.length()>=string1.length())&&(w.substring(0, string1.length()).equalsIgnoreCase(string1)))
                count++;
        }
        return count;
    }
    
}
