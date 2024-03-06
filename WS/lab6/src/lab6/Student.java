/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author TRUNG
 */
public class Student extends Person
{
    private double gpa;

    public Student(String name, int age, double gpa) 
    {
        super(name, age);
        this.gpa = gpa;
    }

    public double getGpa() 
    {
        return gpa;
    }

    public void setGpa(double gpa) 
    {
        this.gpa = gpa;
    }
    
}
