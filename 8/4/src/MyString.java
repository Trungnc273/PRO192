
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

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
            int k=0;
            for(int i=0;i<w.length();i++)
            {
                if((w.toLowerCase().charAt(i)>='a'&&w.toLowerCase().charAt(i)<='z')&&(w.toLowerCase().charAt(i)!='u'&&w.toLowerCase().charAt(i)!='e'&&w.toLowerCase().charAt(i)!='o'&&w.toLowerCase().charAt(i)!='a'&&w.toLowerCase().charAt(i)!='i'))
                    k++;
            }
            if(k>=2)
                count++;
        }
        return count;
    }

    @Override
    public String f2(String str) 
    {
        String s="";
        for(int i=0;i<str.length();i++)
        {
           if(str.toLowerCase().substring(i+1).indexOf(str.toLowerCase().charAt(i))!=-1&&s.indexOf(str.charAt(i))==-1)
               s+=str.toLowerCase().charAt(i);
        }
        char[] sc=s.toCharArray();
        Arrays.sort(sc);
        for(int i=0;i<sc.length/2;i++)
        {
            char c=sc[i];
            sc[i]=sc[sc.length-1-i];
            sc[sc.length-1-i]=c;
        }
        s=new String(sc);
        return s;
    }
    
}
