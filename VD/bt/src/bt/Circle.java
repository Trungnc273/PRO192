/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt;

/**
 *
 * @author TRUNG
 */
public class Circle 
{
    private double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    public double getRadius() 
    {
        return radius;
    }

    public void setRadius(double radius) 
    {
        this.radius = radius;
    }
    
    public double calculateArea()
    {
        return 3.14*radius*radius;
    }
}
