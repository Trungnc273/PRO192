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
    private String name,type;

    public Train() 
    {
    }

    public Train(String name, String type) 
    {
        this.name = name;
        this.type = type;
    }

    public String getName() 
    {
        return name;
    }

    public String getType() 
    {
        return type;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    @Override
    public String toString() 
    {
        return name+","+type;
    }
    
}
