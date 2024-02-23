
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;

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
            for(int i=0;i<w.length();i++)
            {
                if(Character.isDigit(w.charAt(i)))
                {
                    if(w.charAt(i)%2!=0)
                    {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String[] word=str.split("\\s");
        String st="";
        int count=0;
        for(String w:word)
        {
            String rv="";
            if(count==0)
            {
                for(int i=w.length()-1;i>=0;i--)
                {
                    rv+=w.charAt(i);
                }
                if(w.equals(rv)) 
                {
                    w="XX";
                    count=1;
                }
            }
           st+=w+" ";
        }
        return st;
    }
    
}
