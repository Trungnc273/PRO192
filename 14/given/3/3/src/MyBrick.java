
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRUNG
 */
public class MyBrick implements IBrick
{

    @Override
    public void f1(List<Brick> list) 
    {
        double max=list.get(0).getPrice();
        for(Brick l:list)
        {
            if(max<l.getPrice())
                max=l.getPrice();
        }
        for(Brick l:list)
        {
            if(max>l.getPrice())
                l.setPrice(l.getPrice()*1.1);
        }
    }

    @Override
    public int f2(List<Brick> list, double d) 
    {
        int count =0;
        for(Brick l:list)
        {
            if(l.getPrice()<=d)
                count++;
        }
        return count;
    }

    @Override
    public void f3(List<Brick> list) 
    {
        double max=list.get(0).getPrice();
        double m2=list.get(0).getPrice();
        for(Brick l:list)
        {
            if(max<l.getPrice())
                max=l.getPrice();
        }
        for(Brick l:list)
        {
            if(m2<l.getPrice()&&l.getPrice()!=max)
                m2=l.getPrice();
        }
        for(Brick l:list)
        {
            if(m2==l.getPrice())
            {
                list.remove(l);
                break;
            }
        }
    }
    
}
