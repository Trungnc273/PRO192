/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author TRUNG
 */
public class Teacher extends Person
{
    private double salary;

    public Teacher(String name, int age, double salary) 
    {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() 
    {
        return salary;
    }

    public void setSalary(double salary) 
    {
        this.salary = salary;
    }
    
}
