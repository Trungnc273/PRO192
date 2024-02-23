/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class Statue extends Item
{
    private int weight;
    private String colour;

    public Statue() 
    {
        this.weight = 0;
        this.colour = null;
    }

    public Statue(int weight, String colour, int value, String creator) 
    {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() 
    {
        return weight;
    }

    public void setWeight(int weight) 
    {
        this.weight = weight;
    }

    public String getColour() 
    {
        return colour;
    }

    public void setColour(String colour) 
    {
        this.colour = colour;
    }

    @Override
    public int getValue() 
    {
        return value;
    }

    @Override
    public void setValue(int value) {
        
        this.value = value;
    }

    @Override
    public String getCreator() 
    {
        return creator;
    }

    @Override
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }
    public void inputStatue()
    {
        input();
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.print("weight=");
        this.weight=sc1.nextInt();
        System.out.print("colour=");
        this.colour=sc2.nextLine();
    }

    public void outputStatue()
    {
        output(); 
        System.out.println("weight = "+this.weight+"\n"+"colour = "+this.colour);
    }
}
