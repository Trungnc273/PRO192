
import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class MyCala implements ICala
{

    @Override
    public int f1(List<Cala> t) 
    {
     int count=0;
     for(Cala c:t)
     {
         if(Character.isDigit(c.getOwner().charAt(1)))
             count++;
     }
     return count;
    }

    @Override
    public void f2(List<Cala> t) 
    {
       int maxprice=t.get(0).getPrice();
       for(Cala c:t)
       {
           if(maxprice<c.getPrice())
               maxprice=c.getPrice();
       }
       int countdb=2;
       int count =0;
       for(int i=0;i<t.size();i++)
       {
           if(t.get(i).getPrice()==maxprice)
               count++;
           if(count == countdb)
               t.remove(i);
       }
    }

    @Override
    public void f3(List<Cala> t) 
    {
        Collections.sort(t,(c1,c2)->(c1.getOwner().charAt(1)-c2.getOwner().charAt(1) ));
    }
}