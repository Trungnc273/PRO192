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
public class Vase extends Item
{
    private int height;
    private String material;

    public Vase() 
    {
        this.height = 0;
        this.material = null;
    }

    public Vase(int height, String material, int value, String creator) 
    {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() 
    {
        return height;
    }

    public void setHeight(int height) 
    {
        this.height = height;
    }

    public String getMaterial() 
    {
        return material;
    }

    public void setMaterial(String material) 
    {
        this.material = material;
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
    public void inputVase()
    {
        input();
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.print("height=");
        this.height=sc1.nextInt();
        System.out.print("material=");
        this.material=sc2.nextLine();
    }

    public void outputVase()
    {
        output(); 
        System.out.println("height = "+this.height+"\n"+"material = "+this.material);
    }
}
