/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Student implements Comparable<Student>
{
    public String id;
    public String name;
    public double gpa;
    
    public Student(){};
    public Student(String id,String name,double gpa)
    {
        this.id = id;
        this.name=name;
        this.gpa=gpa;
    }
    @Override
    public int compareTo(Student other)
    {
        if(name.compareToIgnoreCase(other.name)==0)
            return Double.compare(gpa, other.gpa);
        else
            return name.compareToIgnoreCase(other.name);
    }
}
