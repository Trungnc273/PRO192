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
public class Painting extends Item
{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() 
    {
        this.height=0;
        this.width=0;
        this.isWatercolour=false;
        this.isFramed=false;
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) 
    {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() 
    {
        return height;
    }

    public void setHeight(int height) 
    {
        this.height = height;
    }

    public int getWidth() 
    {
        return width;
    }

    public void setWidth(int width) 
    {
        this.width = width;
    }

    public boolean isIsWatercolour() 
    {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) 
    {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() 
    {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) 
    {
        this.isFramed = isFramed;
    }

    @Override
    public int getValue() 
    {
        return value;
    }

    @Override
    public void setValue(int value) 
    {
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
    
    public void outputPainting()
    {
        output();
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.print("height = ");
        this.height=sc1.nextInt();
        System.out.print("width = ");
        this.width=sc1.nextInt();
        System.out.print("isWatercolour = ");
        this.isWatercolour=sc2.nextBoolean();
        System.out.print("isFramed = ");
        this.isFramed=sc2.nextBoolean();
    }
    
    public void inputPainting()
    {
        input();
        System.out.println("height = "+this.height);
        System.out.println("width = "+this.width);
        System.out.println("isWatercolour = "+this.isWatercolour);
        System.out.println("isFramed = "+this.isFramed);
    }
}
