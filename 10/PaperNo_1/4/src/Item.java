/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class Item implements IService
{

    private String id,name;
    private int size;

    public Item(String id, String name, int size) 
    {
        this.id = id;
        this.name = name;
        this.size = size;
    }
    
    @Override
    public String formatSize() 
    {
        String s="";
        if(size>=0&&size<=4&&id.equalsIgnoreCase("ZARA"))
            s="XS";
        else if((size>4&&size<=6&&id.equalsIgnoreCase("ZARA"))||(size>=0&&size<=4&&id.equalsIgnoreCase("MANGO")))
            s="S";
        else if(size>4&&size<=6&&id.equalsIgnoreCase("MANGO"))
            s="M";
        else
            s="L";
        return s;
    }

    @Override
    public String formatName() 
    {
        String[] word=name.split("\\s");
        String s="";
        for(String w:word)
        {
            if(w.length()>0)
                s+=w+" ";
        }
        s=s.trim();
        return s;
    }
    
}
