/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class Square extends Rectangle
{
    private String unit;

    public Square(String unit) {
        this.unit = unit;
    }

    public Square(int size) 
    {
        super(size, size);
        this.unit = "cm";
    }
    
    public void setSquare(int size)
    {
        if(size>0)
        {
            super.setLength(size);
            super.setWidth(size);
        }
    }
   
    public int getPerimeter()
    {
        return (super.getLength()+super.getWidth())*2;
    }
    public void output()
    {
        System.out.println("the side of the square="+super.getLength()+unit);
        System.out.println("the perimeter of the square="+getPerimeter()+unit);
    }
    
    
}
