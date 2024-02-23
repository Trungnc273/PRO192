
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
public class MyTrain implements ITrain
{

    @Override
    public int f1(List<Train> t) 
    {
        int sum=0;
        for(Train w:t)
        {
            if(w.getName().contains("A")&&w.getName().contains("B"))
                if((w.getName().lastIndexOf('A')==w.getName().indexOf('A'))&&(w.getName().lastIndexOf('B')==w.getName().indexOf('B')))
                    sum+=w.getLoad();
        }
        return sum;
    }

    @Override
    public void f2(List<Train> t) 
    {
        int max=t.get(0).getLoad();
        for(Train w:t)
        {
            if(max<w.getLoad())
                max=w.getLoad();
        }
        for(Train w:t)
        {
            if(w.getLoad()==max)
            {
                t.remove(w);
                t.add(w);
                break;
            }
        }
    }

    @Override
    public void f3(List<Train> t) 
    {
        int k=t.get(0).getName().length();
        for(Train w:t)
        {
            if(k>w.getName().length())
                k=w.getName().length();
        }
        int count=0;
        for(Train w:t)
        {
            if(count==1&&w.getName().length()==k)
            {
                t.remove(w);
                break;
            }
            if(w.getName().length()==k)
                count++;
            
        }
    }
    
}
