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
public class Item 
{
    protected int value;
    protected String creator;

    public Item() 
    {
        this.value=0;
        this.creator=null;
    }

    public Item(int value, String creator) 
    {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() 
    {
        return value;
    }

    public void setValue(int value) 
    {
        this.value = value;
    }

    public String getCreator() 
    {
        return creator;
    }

    public void setCreator(String creator) 
    {
        this.creator = creator;
    }
    
    public void output()
    {
        System.out.println("value = "+this.value+"\n"+"creator = "+this.creator);
    }
    
    public void input()
    {
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.print("value=");
        this.value=sc1.nextInt();
        System.out.print("creator=");
        this.creator=sc2.nextLine();
    }
}
