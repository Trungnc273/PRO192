/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class SpecBrick extends Brick
{
    private int color;

    public SpecBrick() 
    {
    }

    public SpecBrick(int color) 
    {
        this.color = color;
    }

    public SpecBrick(String place, int price,int color) 
    {
        super(place, price);
        this.color = color;
    }

    @Override
    public String toString() 
    {
        return super.toString()+","+color;
    }
    public void setData()
    {
        String str="";
        str+=super.getPlace().substring(0,2)+"BCA"+super.getPlace().substring(2);
        super.setPlace(str);
    }
    public int getValue()
    {
        if(color>7)
            return super.getPrice()+9;
        else
            return super.getPrice()+6;
    }
}
