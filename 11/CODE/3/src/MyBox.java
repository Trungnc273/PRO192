
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
public class MyBox implements IBox
{

    @Override
    public void f1(List<Box> list) 
    {
        for(Box b:list)
        {
            if(b.getCode().charAt(0)=='K')
                b.setPrice(b.getPrice()+0.1*b.getPrice());
        }
    }

    @Override
    public int f2(List<Box> list, double d) 
    {
        int count=0;
        for(Box b:list)
        {
            if(b.getPrice()>d)
                count++;
        }
        return count;
    }

    @Override
    public void f3(List<Box> list) 
    {
        double m=list.get(0).getPrice();
        int k=0;
        for(Box b:list)
        {
            if(m>b.getPrice())
                m=b.getPrice();
        }
        for(Box b:list)
        {
            if(k==1)
            {
                list.remove(b);
                break;
            }
            if(b.getPrice()==m)
                k++;
        }
    }
    
}
