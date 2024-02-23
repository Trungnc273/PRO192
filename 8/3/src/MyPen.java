
import java.util.Collections;
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
public class MyPen implements IPen
{

    @Override
    public int f1(List<Pen> t) 
    {
        int count=0;
        for(Pen p:t)
        {
            int k=0;
            for(int i=0;i<p.getName().length();i++)
            {
                if(p.getName().charAt(i)=='A')
                    k++;
            }
            if(k>=2)
                count++;
        }
        return count;
    }

    @Override
    public void f2(List<Pen> t) 
    {
        int m=t.get(0).getPrice();
        for(Pen p:t)
        {
            if(m>p.getPrice())
                m=p.getPrice();
        }
        for(Pen p:t)
        {
            if(p.getPrice()==m)
            {
                t.remove(p);
                break;
            }
        }
    }

    @Override
    public void f3(List<Pen> t) 
    {
        Collections.sort(t.subList(2, 7), (c1,c2)->(c1.getPrice()-c2.getPrice()));
        Collections.sort(t.subList(2, 7),(c1,c2)->(c1.getName().compareTo(c2.getName())));
        
    }
    
}
