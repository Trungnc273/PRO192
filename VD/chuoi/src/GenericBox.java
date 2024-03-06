
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRUNG
 */
public class GenericBox<T> 
{
    private List<T> items;
    
    public GenericBox() 
    {
        this.items = new ArrayList<>();
    }
    
    public void add(T item) 
    {
        items.add(item);
    }

    public T get(int index) throws IndexOutOfBoundsException 
    {
        if (index < 0 || index >= items.size()) 
        {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return items.get(index);
    }

    public List<T> getAll() {
        return items;
    }
    
}
