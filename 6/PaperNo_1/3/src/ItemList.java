
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class ItemList extends ArrayList<Item>
{
    public void addItem(Item item)
    {
        super.add(item);
    }
    public void printItemByQuantity(int value)
    {
        for(Item item:this)
        {
            if(item.getQuantity()==value)
                System.out.println(item.toString());
        }
    }
    public int getTotalQuantity()
    {
        int sum=0;
        for(Item item:this)
        {
            sum+=item.getQuantity();
        }
        return sum;
    }
}
