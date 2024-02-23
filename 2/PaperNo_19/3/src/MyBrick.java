
import java.util.Collections;
import java.util.List;
import javafx.print.Collation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class MyBrick implements IBrick 
{

    @Override
    public int f1(List<Brick> t) 
    {
       int count=0;
       for(Brick b:t)
       {
          if(Character.isDigit(b.getPlace().charAt(0))&&(Character.isLetter(b.getPlace().charAt(b.getPlace().length()-1))))
              count++;
       }
       return count;
    }

    @Override
    public void f2(List<Brick> t) 
    {
        int max=-99;
        int k=-1;
        for(int i=0;i<t.size();i++)
        {
            if(t.get(i).getPrice()%2!=0&&t.get(i).getPrice()>max)
            {
                k=i;
                max=t.get(i).getPrice();
            } 
        }
        t.get(k).setPlace("XX");
    }

    @Override
    public void f3(List<Brick> t) 
    {
        int max=-99;
        int k=-1;
        for(int i=0;i<t.size();i++)
        {
            if(t.get(i).getPrice()%2!=0&&t.get(i).getPrice()>max)
            {
                k=i;
                max=t.get(i).getPrice();
            } 
        }
        Collections.sort(t.subList(0, k),(c1,c2)->(c1.getPrice()-c2.getPrice()));
    }
    
}
