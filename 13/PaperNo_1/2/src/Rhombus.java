/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class Rhombus extends Shape
{
    private double diagonal01,diagonal02,side;

    public Rhombus() 
    {
    }

    public Rhombus(String name, double diagonal01, double diagonal02, double side) 
    {
        super(name);
        this.diagonal01 = diagonal01;
        this.diagonal02 = diagonal02;
        this.side = side;
    }
    
    @Override
    public double calculateArea() 
    {
        return (diagonal01*diagonal02)/2;
    }

    @Override
    public double calculatePerimeter() 
    {
        return side*4;
    }

    @Override
    public String toString() 
    {
        return String.format("%s,%.2f,%.2f,%.2f", super.getName(),diagonal01,diagonal02,side);
    }
    
}
