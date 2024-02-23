
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
public class MyTaxi implements ITaxi
{

    @Override
    public int f1(List<Taxi> t) 
    {
        int sum=0;
        for(int i=0;i<t.size();i++)
        {
            if(t.get(i).getDriver().length()>=2)
            {
                String s="";
                for(int j=t.get(i).getDriver().length()-1;j>=0;j--)
                {
                    s+=t.get(i).getDriver().charAt(j);
                }
                if(!t.get(i).getDriver().equals(s))
                    sum+=t.get(i).getSalary();
            }
                
        }
        return sum;
    }

    @Override
    public void f2(List<Taxi> t) 
    {
        int k=0;
        for(int i=0;i<t.size();i++)
        {
            if(k==0)
            {
                if(t.get(i).getSalary()>10&&t.get(i).getSalary()<99)
                {
                    if((t.get(i).getSalary()/10)%2==0&&t.get(i).getSalary()%2==0)
                    {
                        k=1;
                        t.remove(i);
                    }
                }  
            }
            
        }
    }

    @Override
    public void f3(List<Taxi> t) 
    {
        Collections.sort(t,(c1,c2)->(c1.getDriver().compareTo(c2.getDriver())));
        Collections.sort(t,(c1,c2)->-(c1.getSalary()-c2.getSalary()));
    }
    
}
