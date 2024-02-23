/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class Train 
{
    private String name;
    private int load;

    public Train() 
    {
    }

    public Train(String name, int load) 
    {
        this.name = name;
        this.load = load;
    }

    public String getName() 
    {
        return name;
    }

    public int getLoad() 
    {
        return load;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setLoad(int load) 
    {
        this.load = load;
    }
    
}
