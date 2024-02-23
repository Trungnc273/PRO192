/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class Student 
{
    private String id,name;
    private double gpa;

    public Student() 
    {
    }

    public Student(String id, String name, double gpa) 
    {
        this.id = id.toUpperCase();
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() 
    {
        return name;
    }

    public double getGpa() 
    {
        return gpa;
    }

    @Override
    public String toString() 
    {
        return String.format("%s-%s-%.2f",id,name,gpa);
    }
    
}
