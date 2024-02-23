
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRUNG
 */
public class MyPrinter implements IPrinter
{

    @Override
    public void f1(List<Printer> list, double d) 
    {
        for(int i=0;i<list.size();i++)
        {
            if(d>=list.get(i).getPrice())
            {
                list.remove(i);
            }
        }
    }

    @Override
    public int f2(List<Printer> list, String string) 
    {
        int count=0;
        for(Printer l:list)
        {
            if(l.getName().contains(string))
                count++;
        }
        return count;
    }
    
}
