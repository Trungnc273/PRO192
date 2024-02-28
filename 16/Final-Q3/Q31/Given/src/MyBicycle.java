
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRUNG
 */
public class MyBicycle implements IBicycle
{

    @Override
    public void f1(List<Bicycle> list) 
    {
       float c=list.get(0).getPrice();
       for(Bicycle l:list)
       {
           if(l.getPrice()<c)
               c=l.getPrice();
       }
       for(Bicycle l:list)
           if(l.getPrice()==c)
           {
               list.remove(l);
               break;
           }
    }

    @Override
    public int f2(List<Bicycle> list, String string) 
    {
        int count=0;
        for(Bicycle l:list)
        {
            if(l.getName().toLowerCase().endsWith(string.toLowerCase()))
                count++;
        }
        return count;
    }
    
}
