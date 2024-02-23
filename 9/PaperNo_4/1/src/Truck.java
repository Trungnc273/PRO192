/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class Truck 
{
    private String name;
    private int weight;

    public Truck() 
    {
    }

    public Truck(String name, int weight) 
    {
        this.name = name;
        this.weight = weight;
    }

    public String getName() 
    {
        String s=name.substring(2,3)+name.charAt(1);
        return s;
    }

    public int getWeight() 
    {
        return weight;
    }

    public void setWeight(int weight) 
    {
        this.weight = weight+name.length();
    }
    
    
}
