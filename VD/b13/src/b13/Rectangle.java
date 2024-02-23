/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b13;

/**
 *
 * @author TRUNG
 */
class Rectangle 
{
    //public double radius;
    private double a,b;//che

    public double getA() 
    {
        return a;
    }

    public void setA(double a) 
    {
        this.a = a;
    }

    public double getB() 
    {
        return b;
    }

    public void setB(double b) 
    {
        this.b = b;
    }
    
    public double S()
    {
        return a*b;
    }
    public double C()
    {
        return (a+b)*2;
    }
}

